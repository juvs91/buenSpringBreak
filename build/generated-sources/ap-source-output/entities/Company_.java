package entities;

import entities.CommDeviceCatalog;
import entities.SensorCatalog;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-05T20:54:11")
@StaticMetamodel(Company.class)
public class Company_ { 

    public static volatile SingularAttribute<Company, Integer> idCompany;
    public static volatile SingularAttribute<Company, Boolean> active;
    public static volatile CollectionAttribute<Company, CommDeviceCatalog> commDeviceCatalogCollection;
    public static volatile SingularAttribute<Company, String> companyName;
    public static volatile CollectionAttribute<Company, SensorCatalog> sensorCatalogCollection;
    public static volatile SingularAttribute<Company, Date> lastUpdateDate;

}