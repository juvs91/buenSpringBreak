package entities;

import entities.CommDeviceCatalog;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-05T20:54:11")
@StaticMetamodel(CommType.class)
public class CommType_ { 

    public static volatile SingularAttribute<CommType, String> commType;
    public static volatile SingularAttribute<CommType, Boolean> active;
    public static volatile SingularAttribute<CommType, Integer> idCommType;
    public static volatile CollectionAttribute<CommType, CommDeviceCatalog> commDeviceCatalogCollection;
    public static volatile SingularAttribute<CommType, Date> lastUpdateDate;

}