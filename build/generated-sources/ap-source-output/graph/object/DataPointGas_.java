package graph.object;

import graph.object.SensorGas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-15T20:52:08")
@StaticMetamodel(DataPointGas.class)
public class DataPointGas_ { 

    public static volatile SingularAttribute<DataPointGas, Date> time;
    public static volatile SingularAttribute<DataPointGas, Float> value;
    public static volatile SingularAttribute<DataPointGas, SensorGas> sensorGas_ID;
    public static volatile SingularAttribute<DataPointGas, Long> dataPointGas_id;

}