package entity;

import javax.persistence.*;

@Entity
public class Child {

    @EmbeddedId
    private ChildId id;

    @MapsId("parentId") // childId.parentId 매핑
    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    public Parent parent;

    private String name;

}
