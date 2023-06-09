package Chapter21;

import java.io.Serializable;

public class CastingDTO implements Serializable {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
