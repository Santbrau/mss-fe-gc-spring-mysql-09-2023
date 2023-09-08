// Generated with g9.

package db;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Version;

@Entity(name="suministra")
@IdClass(Suministra.SuministraId.class)
public class Suministra implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class SuministraId implements Serializable {
        int codigoPieza;
        java.lang.String idProveedor;
    }

    /** Primary key. */
    protected static final String PK = "SuministraPk";

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
    private int codigoPieza;
    @Id
    @Column(length=4)
    private String idProveedor;
    private int precio;
    private String foreign;
    private String foreign;

    /** Default constructor. */
    public Suministra() {
        super();
    }

    /**
     * Access method for codigoPieza.
     *
     * @return the current value of codigoPieza
     */
    public int getCodigoPieza() {
        return codigoPieza;
    }

    /**
     * Setter method for codigoPieza.
     *
     * @param aCodigoPieza the new value for codigoPieza
     */
    public void setCodigoPieza(int aCodigoPieza) {
        codigoPieza = aCodigoPieza;
    }

    /**
     * Access method for idProveedor.
     *
     * @return the current value of idProveedor
     */
    public String getIdProveedor() {
        return idProveedor;
    }

    /**
     * Setter method for idProveedor.
     *
     * @param aIdProveedor the new value for idProveedor
     */
    public void setIdProveedor(String aIdProveedor) {
        idProveedor = aIdProveedor;
    }

    /**
     * Access method for precio.
     *
     * @return the current value of precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Setter method for precio.
     *
     * @param aPrecio the new value for precio
     */
    public void setPrecio(int aPrecio) {
        precio = aPrecio;
    }

    /**
     * Access method for foreign.
     *
     * @return the current value of foreign
     */
    public String getForeign() {
        return foreign;
    }

    /**
     * Setter method for foreign.
     *
     * @param aForeign the new value for foreign
     */
    public void setForeign(String aForeign) {
        foreign = aForeign;
    }

    /**
     * Access method for foreign.
     *
     * @return the current value of foreign
     */
    public String getForeign() {
        return foreign;
    }

    /**
     * Setter method for foreign.
     *
     * @param aForeign the new value for foreign
     */
    public void setForeign(String aForeign) {
        foreign = aForeign;
    }

    /**
     * Compares the key for this instance with another Suministra.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Suministra and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Suministra)) {
            return false;
        }
        Suministra that = (Suministra) other;
        if (this.getCodigoPieza() != that.getCodigoPieza()) {
            return false;
        }
        Object myIdProveedor = this.getIdProveedor();
        Object yourIdProveedor = that.getIdProveedor();
        if (myIdProveedor==null ? yourIdProveedor!=null : !myIdProveedor.equals(yourIdProveedor)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Suministra.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Suministra)) return false;
        return this.equalKeys(other) && ((Suministra)other).equalKeys(this);
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
        i = getCodigoPieza();
        result = 37*result + i;
        if (getIdProveedor() == null) {
            i = 0;
        } else {
            i = getIdProveedor().hashCode();
        }
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
        StringBuffer sb = new StringBuffer("[Suministra |");
        sb.append(" codigoPieza=").append(getCodigoPieza());
        sb.append(" idProveedor=").append(getIdProveedor());
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
        ret.put("codigoPieza", Integer.valueOf(getCodigoPieza()));
        ret.put("idProveedor", getIdProveedor());
        return ret;
    }

}
