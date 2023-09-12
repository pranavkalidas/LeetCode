package easy;

public class DefangingIpAddress {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
