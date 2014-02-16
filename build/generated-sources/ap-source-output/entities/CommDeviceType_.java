package entities;

import entities.CommDeviceCatalog;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-15T18:47:18")
@StaticMetamodel(CommDeviceType.class)
public class CommDeviceType_ { 

    public static volatile SingularAttribute<CommDeviceType, Integer> idCommDeviceType;
    public static volatile SingularAttribute<CommDeviceType, Boolean> active;
    public static volatile SingularAttribute<CommDeviceType, String> commDeviceType;
    public static volatile CollectionAttribute<CommDeviceType, CommDeviceCatalog> commDeviceCatalogCollection;
    public static volatile SingularAttribute<CommDeviceType, Date> lastUpdateDate;

}