# Loopback Address Information

## Description

Loopback Address Information is a simple Java program that retrieves and displays information about the loopback address. It uses the `InetAddress` class from the Java standard library to get the loopback address of the local machine.

## About the Loopback Address
The loopback address (127.0.0.1 for IPv4 or ::1 for IPv6) is a special IP address that refers to the current machine itself. It is commonly used to test network-related applications locally without involving a physical network.

>A loopback address is a special IP address that is used to establish communication with the local host (the current machine itself) without involving any physical network interface.

>When a network application on a machine sends data to the loopback address, the operating system's networking stack handles the communication internally without sending the data out on the physical network. Instead, it loops the data back to the same machine, allowing the application to communicate with itself as if it were interacting with a remote machine.

>The loopback address is commonly used for testing and troubleshooting network-related applications and services locally

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your system.
- A Java IDE or compiler to run the program (e.g., VS Code,  IntelliJ, or javac command-line tool).

### How to run in VS Code

1. **Install Java Extension Pack**
1. **Open your Java file:** Open the `LoopbackAddressInfo.java` file in Visual Studio Code.
1. **Run the Java file** 
    - Press `F5` or use the "Run and Debug" button in the left sidebar.
    - VS Code will compile and run the LoopbackAddressInfo.java file.
1. When you run the program, it will retrieve the loopback address of the local machine.
1. The program will then display the retrieved loopback address on the console.

### Example Output
```
Loopback Address: 127.0.0.1
```
### Troubleshooting

- If the program does not display the loopback address, there might be an issue with your system's network configuration.