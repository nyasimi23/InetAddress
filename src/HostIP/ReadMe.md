# HostIP Java Program

## Description

HostIP is a simple Java program that allows you to retrieve the **IP address** associated with a given hostname.It utilizes the `InetAddress` class from the Java standard library to perform the __hostname-to-IP__ address resolution.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your system.
- A Java IDE or compiler to run the program (e.g., VS Code,  IntelliJ, or javac command-line tool).

### How to run in VS Code

1. **Install Java Extension Pack**
1. **Open your Java file:** Open the `HostIP.java` file in Visual Studio Code.
1. **Run the Java file** 
    - Press `F5` or use the "Run and Debug" button in the left sidebar.
    - VS Code will compile and run the HostIP.java file.
1. **Input the hostname**: When the program prompts you to enter a hostname, type Hostname and press `Enter`.
1. **View the output**: The output of the program (***the IP address corresponding to the hostname***) will be displayed in the Terminal.

### Example Usage

```
Enter a hostname: example.com
In the IP address for the host: example.com is: example.com/93.184.216.34
```

## Troubleshooting

- If you encounter a `"java.net.UnknownHostException"`, it means the provided hostname couldn't be resolved to an IP address. Double-check the __Hostname spelling__ and ensure that your system has an __active internet connection.__

