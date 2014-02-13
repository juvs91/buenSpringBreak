package entities;

import entities.SensorCatalog;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-05T20:54:11")
@StaticMetamodel(SensorType.class)
public class SensorType_ { 

    public static volatile SingularAttribute<SensorType, String> sensorType;
    public static volatile SingularAttribute<SensorType, Integer> idSensorType;
    public static volatile SingularAttribute<SensorType, Boolean> active;
    public static volatile CollectionAttribute<SensorType, SensorCatalog> sensorCatalogCollection;
    public static volatile SingularAttribute<SensorType, Date> lastUpdateDate;

}