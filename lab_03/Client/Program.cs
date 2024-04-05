using System;
using System.Net.Sockets;
using System.Text;

class Client
{
    static void Main(string[] args)
    {
        Console.WriteLine(
            "Enter action (1 - get a file, 2 - create a file, 3 - delete a file, 4 - determine the server):");
        string chooseAction = Console.ReadLine();
        if (chooseAction != "1" && chooseAction != "2" && chooseAction != "3" && chooseAction != "4")
        {
            Console.WriteLine("Unsupported action. Exiting.");
            return;
        }

        var action = new Dictionary<string, string>()
        {
            { "1", "GET" },
            { "2", "PUT" },
            { "3", "DELETE" },
            { "4", "EXIT" }
        };

        if (action[chooseAction].Equals("EXIT"))
        {
            SendRequest(action[chooseAction], null, null);
        }
        else
        {
            Console.WriteLine("Enter filename:");
            string filename = Console.ReadLine();

            if (action[chooseAction].Equals("PUT"))
            {
                Console.WriteLine("Enter file content:");
                string data = Console.ReadLine();
                SendRequest(action[chooseAction], filename, data);
            }
            else
            {
                SendRequest(action[chooseAction], filename, null);
            }
        }
    }

    static void SendRequest(string action, string filename, string data)
    {
        TcpClient client = new TcpClient("localhost", 8080);
        NetworkStream stream = client.GetStream();
        byte[] requestBytes = Encoding.ASCII.GetBytes($"{action} {filename} {data}\n");
        stream.Write(requestBytes, 0, requestBytes.Length);
        stream.Flush();

        byte[] responseBytes = new byte[1024];
        int bytesRead = stream.Read(responseBytes, 0, responseBytes.Length);
        string response = Encoding.ASCII.GetString(responseBytes, 0, bytesRead);
        Console.WriteLine(response);
    }
}