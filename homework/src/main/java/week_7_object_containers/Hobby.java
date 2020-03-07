package week_7_object_containers;

import java.util.LinkedList;
import java.util.List;

class Hobby {

    private String name;
    private int frequency;
    private List<Address> addressList = new LinkedList<>();


    Hobby(String name, int frequency) {
        this.name = (name != null) ? name : "Missing_name";
        this.frequency = frequency;
    }


    String getName() {
        return name;
    }

    int getFrequency() {
        return frequency;
    }

    List<Address> getAddressList() {
        return addressList;
    }


    /**
     * Adds a non-null address to the address list
     *
     * @param address
     * @return True if successfully added to the list, false otherwise
     */
    boolean addAddress(Address address) {
        if (address != null)
            return addressList.add(address);
        else
            return false;
    }
}
