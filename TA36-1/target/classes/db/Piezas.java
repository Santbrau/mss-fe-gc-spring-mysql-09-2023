// Generated with g9.

package db;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="piezas")
public class Piezas implements Serializable {

    /** Primary key. */
    protected static final String PK = "codigo";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int codigo;
    @Column(length=100)
    private String nombre;

    /** Default constructor. */
    public Piezas() {
        super();
    }

    /**
     * Access method for codigo.
     *
     * @return the current value of codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Setter method for codigo.
     *
     * @param aCodigo the new value for codigo
     */
    public void setCodigo(int aCodigo) {
        codigo = aCodigo;
    }

    /**
     * Access method for nombre.
     *
     * @return the current value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter method for nombre.
     *
     * @param aNombre the new value for nombre
     */
    public void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * Compares the key for this instance with another Piezas.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Piezas and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Piezas)) {
            return false;
        }
        Piezas that = (Piezas) other;
        if (this.getCodigo() != that.getCodigo()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Piezas.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Piezas)) return false;
        return this.equalKeys(other) && ((Piezas)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getCodigo();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Piezas |");
        sb.append(" codigo=").append(getCodigo());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("codigo", Integer.valueOf(getCodigo()));
        return ret;
    }

}
