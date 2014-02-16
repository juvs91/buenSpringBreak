package entities;

import entities.CommDeviceCatalog;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-15T20:52:08")
=======
@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-15T18:47:18")
>>>>>>> 467fbd065cca84085693ca57f037cda2d6f6cba5
@StaticMetamodel(CommType.class)
public class CommType_ { 

    public static volatile SingularAttribute<CommType, String> commType;
    public static volatile SingularAttribute<CommType, Boolean> active;
    public static volatile SingularAttribute<CommType, Integer> idCommType;
    public static volatile CollectionAttribute<CommType, CommDeviceCatalog> commDeviceCatalogCollection;
    public static volatile SingularAttribute<CommType, Date> lastUpdateDate;

}