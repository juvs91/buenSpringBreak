package graph.object;

import graph.object.SensorTemp;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-15T20:52:08")
@StaticMetamodel(DataPointTemp.class)
public class DataPointTemp_ { 

    public static volatile SingularAttribute<DataPointTemp, Long> dataPointTemp_id;
    public static volatile SingularAttribute<DataPointTemp, Date> time;
    public static volatile SingularAttribute<DataPointTemp, SensorTemp> sensorTemp_ID;
    public static volatile SingularAttribute<DataPointTemp, Float> value;

}