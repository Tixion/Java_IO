import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class House implements Serializable {
    private static final long serialVersionUID = 1;
    private String cadastralNumber;
    private String address;
    private Person houseMaster;
    private List<Flat> listFlat;

    public House(String cadastralNumber, String address, Person houseMaster, List<Flat> listFlat) {
        this.setCadastralNumber(cadastralNumber);
        this.setAddress(address);
        this.sethouseMaster(houseMaster);
        this.listFlat = listFlat;
    }

    public String getCadastralNumber() {
        return cadastralNumber;
    }

    public void setCadastralNumber(String cadastralNumber) {
        if (cadastralNumber == null) throw new IllegalArgumentException("CadastralNubber must be not null!");
        this.cadastralNumber = cadastralNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null) throw new IllegalArgumentException("Address must be not null!");
        this.address = address;
    }

    public Person gethouseMaster() {
        return houseMaster;
    }

    public void sethouseMaster(Person houseMaster) {
        if (houseMaster == null) throw new IllegalArgumentException("houseMaster must be not null!");
        this.houseMaster = new Person(houseMaster);
    }

    public List<Flat> getListFlat() {
        return listFlat;
    }

    public void setListFlat(List<Flat> listFlat) {
        this.listFlat = listFlat;
    }

    House() {}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        listFlat.sort(Comparator.comparing(Flat::getNumber));
        house.listFlat.sort(Comparator.comparing(Flat::getNumber));
        return Objects.equals(cadastralNumber, house.cadastralNumber) &&
                Objects.equals(address, house.address) &&
                Objects.equals(houseMaster, house.houseMaster) &&
                Objects.equals(listFlat, house.listFlat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cadastralNumber, address, houseMaster, listFlat);
    }

    @Override
    public String toString() {
        return "House{" +
                "cadastralNumber='" + cadastralNumber + '\'' +
                ", address='" + address + '\'' +
                ", houseMaster=" + houseMaster +
                ", listFlat=" + listFlat +
                '}';
    }
}