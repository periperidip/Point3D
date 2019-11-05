/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
/**
 * @author Shourya Shukla
 * @version $Revision$
 */


//This is an extension to the Point2D library in Java.

package Point3D;


//import org.apache.harmony.misc.HashCode;
/**
 * The Class Point2D represents a point whose data is given in high-precision
 * values appropriate for graphical operations.
 * 
 * @since Android 1.0
 */
public abstract class Point3D implements Cloneable {
    /**
     * The Class Float is the subclass of Point2D that has all of its data
     * values stored with float-level precision.
     * 
     * @since Android 1.0
     */
    public static class Float extends Point3D{
        /**
         * The x coordinate.
         */
        public float x;
        /**
         * The y coordinate.
         */
        public float y;
        /**
         * The z coordinate.
         */
        public float z;
        /**
         * Instantiates a new float-valued Point2D with its data set to zero.
         */
        public Float() {
        }
        /**
         * Instantiates a new float-valued Point2D with the specified
         * coordinates.
         * 
         * @param x
         *            the x coordinate.
         * @param y
         *            the y coordinate.
         * @param z
         *            the z coordinate.
         */
        public Float(float x, float y, float z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        @Override
        public double getX() {
            return x;
        }
        @Override
        public double getY() {
            return y;
        }
        @Override
        public double getZ() {     //TODO check the func getZ()
            return z;
        }
        /**
         * Sets the point's coordinates.
         * 
         * @param x
         *            the x coordinate.
         * @param y
         *            the y coordinate.
         * @param z
         *            the z coordinate.
         */
        public void setLocation(float x, float y, float z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        @Override
        public void setLocation(double x, double y, double z) {
            this.x = (float)x;
            this.y = (float)y;
            this.z = (float)z;
        }
        @Override
        public String toString() {
            return getClass().getName() + "[x=" + x + ",y=" + y + "z=" + z + "]"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        }
    }
    /**
     * The Class Double is the subclass of Point2D that has all of its data
     * values stored with double-level precision.
     * 
     * @since Android 1.0
     */
    public static class Double extends Point3D {
        /**
         * The x coordinate.
         */
        public double x;
        /**
         * The y coordinate.
         */
        public double y;
        /**
         * The z coordinate.
         */
        public double z;
        /**
         * Instantiates a new double-valued Point2D with its data set to zero.
         */
        public Double() {
        }
        /**
         * Instantiates a new double-valued Point2D with the specified
         * coordinates.
         * 
         * @param x
         *            the x coordinate.
         * @param y
         *            the y coordinate.
         * @param z
         *            the z coordinate.
         */
        public Double(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        @Override
        public double getX() {
            return x;
        }
        @Override
        public double getY() {
            return y;
        }
        @Override
        public double getZ() {
            return z;
        }
        @Override
        public void setLocation(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        @Override
        public String toString() {
            return getClass().getName() + "[x=" + x + ",y=" + y + "z=" + z + "]"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        }
    }  // END OF CLASS DOUBLE
   
    /**
     * Instantiates a new Point2D.
     */
    protected Point3D() {
    }
    /**
     * Gets the x coordinate.
     * 
     * @return the x coordinate.
     */
    public abstract double getX();
    /**
     * Gets the y coordinate.
     * 
     * @return the y coordinate.
     */
    public abstract double getY();
    /**
    * Gets the z coordinate.
    * 
    * @return the z coordinate.
    */
   public abstract double getZ();
    /**
     * Sets the point's coordinates.
     * 
     * @param x
     *            the x coordinate.
     * @param y
     *            the y coordinate.
     * @param z
     *            the z coordinate.
     */
    public abstract void setLocation(double x, double y, double z);
    /**
     * Sets the point's coordinates by copying them from another point.
     * 
     * @param p
     *            the point to copy the data from.
     */
    public void setLocation(Point3D p) {
        setLocation(p.getX(), p.getY(), p.getZ());
    }
    /**
     * Finds the square of the distance between the two specified points.
     * 
     * @param x1
     *            the x coordinate of the first point.
     * @param y1
     *            the y coordinate of the first point.
     * @param z1
     *            the z coordinate of the first point.           
     * @param x2
     *            the x coordinate of the second point.
     * @param y2
     *            the y coordinate of the second point.
     * @param z2
     *            the z coordinate of the second point.           
     * @return the square of the distance between the two specified points.
     */
    public static double distanceSq(double x1, double y1, double z1, double x2, double y2, double z2) {
        x2 -= x1;
        y2 -= y1;
        z2 -= z1;
        return x2 * x2 + y2 * y2 + z2 * z2;
    }
    /**
     * Finds the square of the distance between this point and the specified
     * point.
     * 
     * @param px
     *            the x coordinate of the point.
     * @param py
     *            the y coordinate of the point.
     * @param pz
     *            the z coordinate of the point.
     * @return the square of the distance between this point and the specified
     *         point.
     */
    public double distanceSq(double px, double py, double pz) {
        return Point3D.distanceSq(getX(), getY(), getZ(), px, py, pz);
    }
    /**
     * Finds the square of the distance between this point and the specified
     * point.
     * 
     * @param p
     *            the other point.
     * @return the square of the distance between this point and the specified
     *         point.
     */
    public double distanceSq(Point3D p) {
        return Point3D.distanceSq(getX(), getY(), getZ(), p.getX(), p.getY(), p.getZ());
    }
    /**
     * Finds the distance between the two specified points.
     * 
     * @param x1
     *            the x coordinate of the first point.
     * @param y1
     *            the y coordinate of the first point.
     * @param z1
     *            the z coordinate of the first point.           
     * @param x2
     *            the x coordinate of the second point.
     * @param y2
     *            the y coordinate of the second point.
     * @param z2
     *            the z coordinate of the second point.           
     * @return the distance between the two specified points.
     */
    public static double distance(double x1, double y1,double z1, double x2, double y2, double z2) {
        return Math.sqrt(distanceSq(x1, y1, z1, x2, y2, z2));
    }
    /**
     * Finds the distance between this point and the specified point.
     * 
     * @param px
     *            the x coordinate of the point.
     * @param py
     *            the y coordinate of the point.
     * @param pz
     *            the z coordinate of the point.            
     * @return the distance between this point and the specified point.
     */
    public double distance(double px, double py, double pz) {
        return Math.sqrt(distanceSq(px, py, pz));
    }
    /**
     * Finds the distance between this point and the specified point.
     * 
     * @param p
     *            the other point.
     * @return the distance between this point and the specified point.
     */
    public double distance(Point3D p) {
        return Math.sqrt(distanceSq(p));
    }
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError();
        }
    }
    @Override
    public int hashCode() {                //TODO IMPLEMENT HASHCODE
        HashCode hash = new HashCode(); 
        hash.append(getX());
        hash.append(getY());
        hash.append(getZ());
        return hash.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Point3D) {
            Point3D p = (Point3D)obj;
            return getX() == p.getX() && getY() == p.getY() && getZ()==p.getZ();
        }
        return false;
    }
}