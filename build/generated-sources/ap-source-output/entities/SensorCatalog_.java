package entities;

import entities.Company;
import entities.OutputFormat;
import entities.OutputType;
import entities.SensorTags;
import entities.SensorType;
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
@StaticMetamodel(SensorCatalog.class)
public class SensorCatalog_ { 

    public static volatile SingularAttribute<SensorCatalog, String> model;
    public static volatile SingularAttribute<SensorCatalog, Company> idCompany;
    public static volatile CollectionAttribute<SensorCatalog, SensorTags> sensorTagsCollection;
    public static volatile SingularAttribute<SensorCatalog, OutputFormat> idOutputFormat;
    public static volatile SingularAttribute<SensorCatalog, SensorType> idSensorType;
    public static volatile SingularAttribute<SensorCatalog, Boolean> active;
    public static volatile SingularAttribute<SensorCatalog, OutputType> idOutputType;
    public static volatile SingularAttribute<SensorCatalog, Integer> idSensorCatalog;
    public static volatile SingularAttribute<SensorCatalog, String> reference;
    public static volatile SingularAttribute<SensorCatalog, Date> lastUpdateDate;

}