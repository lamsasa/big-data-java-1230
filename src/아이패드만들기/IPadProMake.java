package 아이패드만들기;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class IPadProMake {
    private int screen; // 화면 크기 : 11인치, 12.9 인치
    private int color; // 색상 : 스페이스 그레이, 실버
    private int memory; // 용량 : 128GB, 256GB, 512GB, 1TB
    private int network; // 네트워크 : Wi-Fi, Wi-Fi+Cellular
    String name; // 각인 서비스 시 이름 저장
    String productDate; // 제품 생산 일자 (시리얼 넘버를 만들 때 사용)
    private String serialNum; // 제품 일련 번호 : iPad13128C2301121
    static int cnt = 0; // 클래스 변수 : 객체 시 생성되지 않고 클래스 생성시 만들어 짐
    public IPadProMake(String name) {
        this.name =name;
        Date now = new Date(); // 현재의 시간 정보를 가져오기 위해 사용
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        productDate = sdf.format(now); // 시간 정보 중 "yyMMdd" 패턴으로 시간 정보를 가져옴
        cnt++; // 생성자는 객체가 만들어 질 때 호출되므로 생성된 객체의 횟수를 확인하는 용도로 사용 가능
        productDate += cnt; // 년월일 + 생산개수
    }
    // 제품 구매에 대한 진행여부를 묻는 메뉴 만들기
    public boolean continueOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== iPad Pro 구매하기 ====");
        System.out.println("구입 하시려면, yes / 종료는 quit : ");
        String isContinue =sc.next();
        if(isContinue.equalsIgnoreCase("yes")) return true;
        return false;
    }
    // 화면 크기 정하기
    public void setScreen() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("디스플레이 선택 [1] 11인치, [2] 12.9 인치 : ");
            screen = sc.nextInt();
            if (screen == 1 || screen == 2) return; // 여기서 해당 메소드 끝남
            System.out.println("디스플레이를 다시 선택하시오");
        }
    }
        public void setColor() {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("컬러 선택 [1] 스페이스 그레이, [2] 실버");
                color = sc.nextInt();
                if (color == 1 || color == 2) return;
                System.out.println("컬러를 다시 선택하시오.");
            }
        }
            public void setMemory() {
                Scanner sc = new Scanner(System.in);
                while (true) {
                    System.out.print("용량 선택 [1]128GB, [2] 256 [3] 512 [4] 1T : ");
                    memory =sc.nextInt();
                    if(memory > 0 && memory < 5) return;
                    System.out.println("용량을 다시 선택하세요");

                }
            }
             public void setNetWork() {
                Scanner sc = new Scanner(System.in);
                while (true) {
                    System.out.print("네트워크 선택 [1]Wi-Fi, [2]Wi-Fi+Cellular : ");
                    network =sc.nextInt();
                    if(network == 1 || network == 2) return;
                    System.out.println("네트워크를 다시 입력하시오.");
                }
            }
            public void setName() {
                Scanner sc = new Scanner(System.in);
                System.out.print("각인 서비스를 신청 하시겠습니까? ");
                String service =sc.next();
                if(service.equalsIgnoreCase("yes")) {
                    System.out.print("이름을 입력 : ");
                    name = sc.next();
                }
            }
            // 일련 번호 만들기 : iPad + 11/13 + 128/256/512/1024 + W/C +230112 + 생산 개수
            public void setSerialNum() {
                String screenStr = (screen == 1) ? "11" : "13";
                String[] memStr = {"", "128GB", "256GB", "512GB", "1024GB"};
                String netStr = (network == 1) ? "W" : "C";
                serialNum = "iPad" + screenStr + memStr[memory] + netStr + productDate;
            }
            // 제품구매가 완료되면 출고까지 30초 대기 이후 출고 하기
            public void inProductPad() throws InterruptedException {
                int cnt = 0;
                while (true) {
                    sleep(300);
                    cnt++;
                    System.out.print(" << iPad Pro 제작 중 : [" + cnt + "%] >>");
                    System.out.print("\r"); // cnt 값만 변경 돼서 찍히게 만든다.
                    if(cnt >= 100) break;
                }
            }
            public void  productPad() {
                final String[] scrType = {"", "11인치", "12.9인치"};
                final String[] colorType = {"", "스페이스 그레이", "실버"};
                final String[] memType = {"", "128GB", "256GB", "512GB", "1TB"};
                final String[] netType = {"", "Wi-Fi", "Wi-Fi+Cellular"};
                System.out.println("=== iPad Pro 가 출고 되었습니다 ===");
                System.out.println("디스플레이 : " + scrType[screen]);
                System.out.println("제품 색상 : " + colorType[color]);
                System.out.println("제품 용량 : " + memType[memory]);
                System.out.println("네크워크  : " + netType[network]);
                System.out.println("이름     : " + name);
                System.out.println("일련번호(S/N) : " + serialNum);
                System.out.println("---------------------------------------");
            }
        }


