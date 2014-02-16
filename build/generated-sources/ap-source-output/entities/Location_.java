package entities;

import entities.CommDeviceTags;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-15T18:47:18")
@StaticMetamodel(Location.class)
public class Location_ { 

    public static volatile SingularAttribute<Location, String> locationDescription;
    public static volatile SingularAttribute<Location, Boolean> active;
    public static volatile SingularAttribute<Location, String> locationName;
    public static volatile CollectionAttribute<Location, CommDeviceTags> commDeviceTagsCollection;
    public static volatile SingularAttribute<Location, Integer> idLocation;
    public static volatile SingularAttribute<Location, Date> lastUpdateDate;

}