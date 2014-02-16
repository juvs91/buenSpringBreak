package entities;

import entities.CommDeviceCatalog;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-15T20:52:08")
@StaticMetamodel(CommProtocol.class)
public class CommProtocol_ { 

    public static volatile SingularAttribute<CommProtocol, String> commProtocol;
    public static volatile SingularAttribute<CommProtocol, Boolean> active;
    public static volatile CollectionAttribute<CommProtocol, CommDeviceCatalog> commDeviceCatalogCollection;
    public static volatile SingularAttribute<CommProtocol, Integer> idCommProtocol;
    public static volatile SingularAttribute<CommProtocol, Date> lastUpdateDate;

}