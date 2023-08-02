# IP Address Resolver

## Description

IP Address Resolver is a simple Java program that allows you to retrieve the **IP address** associated with a given **URL (hostname)**. It uses the `InetAddress` class from the Java standard library to perform __URL-to-IP__ address resolution.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your system.
- A Java IDE or compiler to run the program (e.g., VS Code,  IntelliJ, or javac command-line tool).

### How to run in VS Code

1. **Install Java Extension Pack**
1. **Open your Java file:** Open the `IPaddressResolver.java` file in Visual Studio Code.
1. **Run the Java file** 
    - Press `F5` or use the "Run and Debug" button in the left sidebar.
    - VS Code will compile and run the IPaddressResolver.java file.
1. **Input the URL**: When the program prompts you to enter a URL, type URL and press   `Enter`.
1. **View the output**: The output of the program (***the IP address corresponding to the URL***) will be displayed in the Terminal.


### Example Usage

```
Enter a URL: www.example.com
IP Address: 93.184.216.34
```

### Troubleshooting

- If the program displays `"Unable to resolve the IP address for the provided URL,"` it means the provided URL couldn't be resolved to an IP address. Double-check the __URL spelling__ and ensure that your system has an __active internet connection.__