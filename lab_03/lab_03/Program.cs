using System;
using System.IO;
using System.Net;
using System.Net.Sockets;
using System.Text;

class Server
{
    static void Main(string[] args)
    {
        TcpListener server = new TcpListener(IPAddress.Parse("127.0.0.1"), 8080);
        server.Start();
        Console.WriteLine("Server started!");

        while (true)
        {
            TcpClient client = server.AcceptTcpClient();
            NetworkStream stream = client.GetStream();
            StreamReader reader = new StreamReader(stream);
            StreamWriter writer = new StreamWriter(stream);

            string? request = reader.ReadLine();
            string response = HandleRequest(request);
            writer.WriteLine(response);

            
            writer.Close();
            reader.Close();
            stream.Close();
            client.Close();
            if (response.Equals("server was stopped"))
            {
                server.Stop();
            }
        }
    }

    static string HandleRequest(string? request)
    {
        string[] requestParts = request.Split(' ');
        if (requestParts.Length < 3 ||
            (requestParts[0] != "PUT" && requestParts[0] != "GET" && requestParts[0] != "DELETE" &&
             requestParts[0] != "EXIT"))
        {
            return "400 Bad Request";
        }

        string filename = requestParts[1];
        string data = string.Join(" ", requestParts, 2, requestParts.Length - 2);
        string consoleOutput = "";
        string path = $"../../../{filename}";

        if (requestParts[0].Equals("PUT"))
        {
            if (isExist(path, 0).Equals("0"))
            {
                File.WriteAllText(path, data);
                consoleOutput = "200 OK";
            }
            else
            {
                consoleOutput = isExist(path, 0);
            }
        }


        else if (requestParts[0].Equals("GET"))
        {
            if (isExist(path, 1).Equals("0"))
            {
                string text = File.ReadAllText(path);
                consoleOutput = "200 " + text;
            }
            else
            {
                consoleOutput = isExist(path, 1);
            }
        }


        else if (requestParts[0].Equals("DELETE"))
        {
            if (isExist(path, 1).Equals("0"))
            {
                File.Delete(path);
                consoleOutput = $"200 file '{filename}' was deleted";
            }
            else
            {
                consoleOutput = isExist(path, 1);
            }
        }

        else if (requestParts[0].Equals("EXIT"))
        {
            return "server was stopped";
        }

        return consoleOutput;
    }

    static string isExist(string path, int action)
    {
        string consoleOutput = "";

        try
        {
            if (File.Exists(path))
            {
                if (action == 0)
                {
                    consoleOutput = "403 file already exist";
                }
                else
                {
                    consoleOutput = "0";
                }
            }
            else
            {
                if (action == 0)
                {
                    consoleOutput = "0";
                }
                else
                {
                    consoleOutput = "404 file does not exist";
                }
            }
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
            return consoleOutput;
        }

        return consoleOutput;
    }
}