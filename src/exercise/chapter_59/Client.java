package exercise.chapter_59;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        // TODO: 서버에 연결
        try(Socket socket = new Socket("localhost", 1234)) {

            // TODO: 서버로 데이터를 보내기 위한 OutputStream 생성
            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            // TODO: 서버로 부터 데이터를 받기 위한 InputStream 생성
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            Customer customer = new Customer("아이유","ID2");
            // TODO: 서버에 메시지 전송
            objectOutputStream.writeObject(customer);
            objectOutputStream.flush();

            // TODO: 서버로부터 받은 응답 출력
            String response = bufferedReader.readLine();
            System.out.println("서버 응답(고객 대기 리스트): " + response);
            System.out.println("Client: 종료되었습니다.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
