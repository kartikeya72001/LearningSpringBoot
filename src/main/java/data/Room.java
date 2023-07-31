package data;

import jakarta.persistence.*;

@Entity
@Table(name="Room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ROOM_ID")
    private long id;
    @Column(name="NAME")
    private String name;
    @Column(name="ROOM_NUMBER")
    private String roomNumber;
    @Column(name="BED_INFO")
    private String bed_info;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoom_no(String room_no) {
        this.roomNumber = room_no;
    }

    public String getBed_info() {
        return bed_info;
    }

    public void setBed_info(String bed_info) {
        this.bed_info = bed_info;
    }

    @Override
    public String toString(){
        return "Room{" +
                    "id=" + id +
                    ",name='" + name + '\'' +
                    ", roomNumber='" + roomNumber + '\'' +
                    ", bedInfo='" + bed_info + '\'' +
                '}';
    }
}
