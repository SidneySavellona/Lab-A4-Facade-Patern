public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.requestValetService("aaa123");

        frontDesk.requestHouseKeepingService(1337);

        frontDesk.requestCartService(2);
    }
}