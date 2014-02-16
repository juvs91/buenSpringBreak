package entities;

import entities.CommDeviceCatalog;
import entities.Location;
import entities.Module;
import entities.SensorTags;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-15T20:52:08")
@StaticMetamodel(CommDeviceTags.class)
public class CommDeviceTags_ { 

    public static volatile SingularAttribute<CommDeviceTags, String> commDeviceTag;
    public static volatile SingularAttribute<CommDeviceTags, Module> idModule;
    public static volatile SingularAttribute<CommDeviceTags, CommDeviceCatalog> idCommDeviceCatalog;
    public static volatile CollectionAttribute<CommDeviceTags, SensorTags> sensorTagsCollection;
    public static volatile SingularAttribute<CommDeviceTags, Integer> periodMs;
    public static volatile SingularAttribute<CommDeviceTags, Boolean> active;
    public static volatile SingularAttribute<CommDeviceTags, Date> insertDate;
    public static volatile SingularAttribute<CommDeviceTags, Location> idLocation;
    public static volatile SingularAttribute<CommDeviceTags, Date> lastUpdateDate;

}