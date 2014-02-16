package entities;

import entities.CommDeviceCatalog;
import entities.SensorCatalog;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-15T18:47:18")
@StaticMetamodel(OutputType.class)
public class OutputType_ { 

    public static volatile SingularAttribute<OutputType, Integer> idOutputType;
    public static volatile SingularAttribute<OutputType, String> outputType;
    public static volatile SingularAttribute<OutputType, Boolean> active;
    public static volatile CollectionAttribute<OutputType, CommDeviceCatalog> commDeviceCatalogCollection;
    public static volatile CollectionAttribute<OutputType, SensorCatalog> sensorCatalogCollection;
    public static volatile SingularAttribute<OutputType, Date> lastUpdateDate;

}