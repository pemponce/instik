FROM mcr.microsoft.com/dotnet/runtime:6.0 AS base
WORKDIR /app

FROM mcr.microsoft.com/dotnet/sdk:6.0 AS build
WORKDIR /src
COPY ["lab_03/lab_03.csproj", "lab_03/"]
RUN dotnet restore "lab_03/lab_03.csproj"
COPY . .
WORKDIR "/src/lab_03"
RUN dotnet build "lab_03.csproj" -c Release -o /app/build

FROM build AS publish
RUN dotnet publish "lab_03.csproj" -c Release -o /app/publish /p:UseAppHost=false

FROM base AS final
WORKDIR /app
COPY --from=publish /app/publish .
ENTRYPOINT ["dotnet", "lab_03.dll"]
