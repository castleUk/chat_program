package me.castleuk.chat;

import java.util.Scanner;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatApplication {

	public static void main(String[] args) {
		// 서버 단 -----------------------------------------------------
		try {
			ChatServer chatServer = new ChatServer();
			chatServer.start();

			System.out.println("=================================");
			System.out.println("서버를 종료하려면 q를 입력하고 Enter");
			System.out.println("====================================");

			Scanner scanner = new Scanner(System.in);
			while (true) {
				String key = scanner.nextLine();
				if (key.equals("q"))
					break;

			}
			scanner.close();
			chatServer.stop();
		} catch (Exception e) {
			System.out.println("[서버]" + e.getMessage());
		}

	}
}
