package entities;

import entities.SensorCatalog;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-05T20:54:11")
@StaticMetamodel(OutputFormat.class)
public class OutputFormat_ { 

    public static volatile SingularAttribute<OutputFormat, String> outputFormat;
    public static volatile SingularAttribute<OutputFormat, Integer> idOutputFormat;
    public static volatile SingularAttribute<OutputFormat, Boolean> active;
    public static volatile CollectionAttribute<OutputFormat, SensorCatalog> sensorCatalogCollection;
    public static volatile SingularAttribute<OutputFormat, Date> lastUpdateDate;

}