package exercise.chapter_63;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class RequestHandler implements Runnable {

    private Socket clientSocket;
    private List<Customer> customerList;

    public RequestHandler(Socket clientSocket, List<Customer> customerList) {
        this.clientSocket = clientSocket;
        this.customerList = customerList;
    }

    @Override
    public void run() {

        try {
            System.out.println("클라이언트가 접속하였습니다.");

            // TODO: 클라이언트로 부터 데이터를 받기 위한 InputStream 생성
            InputStream clientInputstream = clientSocket.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(clientInputstream);

            // TODO: 클라이언트로 데이터를 보내기 위한 OutputStream 생성
            OutputStream serverOutputStream = clientSocket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(serverOutputStream, true);


            Customer customer = (Customer) objectInputStream.readObject();

            ListUtils.addList(customerList, customer);
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + customer + "가 대기명단에 추가되었습니다.");

            printWriter.println("현재 고객 대기 명단은: " + customerList);

            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
