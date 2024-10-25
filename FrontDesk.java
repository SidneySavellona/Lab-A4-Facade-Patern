public class FrontDesk {
    public void requestValetService(String plateNumber) {
        Valet valet = new Valet(plateNumber);
        valet.DoService();
    }

    public void requestHouseKeepingService(int roomNumber) {
        HouseKeeping houseKeeping = new HouseKeeping(roomNumber);
        houseKeeping.DoService();
    }

    public void requestCartService(int numberOfCarts) {
        Cart cart = new Cart(numberOfCarts);
        cart.DoService();
    }
}