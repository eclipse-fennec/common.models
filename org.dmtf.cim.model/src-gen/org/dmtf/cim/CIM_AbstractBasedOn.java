/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Abstract Based On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract BasedOn is an association describing how StorageExtents (or views of StorageExtents) can be assembled from lower level Extents (or views of extents).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AbstractBasedOn#getStartingAddress <em>Starting Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractBasedOn#getEndingAddress <em>Ending Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractBasedOn#getOrderIndex <em>Order Index</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AbstractBasedOn()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Association='true' Abstract='true' Version='2.45.0' UMLPackagePath='CIM::Core::StorageExtent' override.Antecedent='CIM_ManagedElement REF' override.Antecedent.Key='true' override.Antecedent.Description='The lower level StorageExtent (or view of the extent).' override.Dependent='CIM_ManagedElement REF' override.Dependent.Key='true' override.Dependent.Description='The higher level StorageExtent (or view of the extent).' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AbstractBasedOn extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Starting Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StartingAddress indicates where in lower level storage, the higher level Extent begins.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Starting Address</em>' attribute.
	 * @see #setStartingAddress(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractBasedOn_StartingAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getStartingAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractBasedOn#getStartingAddress <em>Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Address</em>' attribute.
	 * @see #getStartingAddress()
	 * @generated
	 */
	void setStartingAddress(Long value);

	/**
	 * Returns the value of the '<em><b>Ending Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EndingAddress indicates where in lower level storage, the higher level Extent ends. This property is useful when mapping non-contiguous Extents into a higher level grouping.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ending Address</em>' attribute.
	 * @see #setEndingAddress(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractBasedOn_EndingAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getEndingAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractBasedOn#getEndingAddress <em>Ending Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ending Address</em>' attribute.
	 * @see #getEndingAddress()
	 * @generated
	 */
	void setEndingAddress(Long value);

	/**
	 * Returns the value of the '<em><b>Order Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If there is an order to the BasedOn associations that describe how a higher level StorageExtent is assembled, the OrderIndex property indicates this. When an order exists, the instances of BasedOn with the same Dependent value (i.e., the same higher level Extent) should place unique values in the OrderIndex property. The lowest value implies the first member of the collection of lower level Extents, and increasing values imply successive members of the collection. If there is no ordered relationship, a value of zero should be specified. An example of the use of this property is to define a RAID-0 striped array of 3 disks. The resultant RAID array is a StorageExtent that is dependent on (BasedOn) the StorageExtents that describe each of the 3 disks. The OrderIndex of each BasedOn association from the disk Extents to the RAID array could be specified as 1, 2 and 3 to indicate the order in which the disk Extents are used to access the RAID data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Index</em>' attribute.
	 * @see #setOrderIndex(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractBasedOn_OrderIndex()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getOrderIndex();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractBasedOn#getOrderIndex <em>Order Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Index</em>' attribute.
	 * @see #getOrderIndex()
	 * @generated
	 */
	void setOrderIndex(Integer value);

} // CIM_AbstractBasedOn
