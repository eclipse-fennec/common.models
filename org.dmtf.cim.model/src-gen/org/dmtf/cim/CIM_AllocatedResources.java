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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Allocated Resources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of SystemSpecificCollection for collecting leaf remote resources that have been allocated for use in a system (e.g., StorageVolumes assigned to a virtualizer's StoragePool). This class collects all the allocated resources of a specific type for the system that can be found (via the MemberOfCollection associations) from the collection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AllocatedResources#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AllocatedResources#getCollectionDiscriminator <em>Collection Discriminator</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AllocatedResources()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Cascading' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_AllocatedResources extends CIM_SystemSpecificCollection {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the type of element that is collected by this AllocatedResources collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see #setElementType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocatedResources_ElementType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\"]' Values='[\"Unknown\",\"Reserved\",\"Any Type\",\"StorageVolume\",\"StorageExtent\",\"StoragePool\",\"ComputerSystem\",\"LogicalDisk\",\"FileShare\",\"Volume Group\",\"Filesystem\"]'"
	 * @generated
	 */
	Integer getElementType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AllocatedResources#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' attribute.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(Integer value);

	/**
	 * Returns the value of the '<em><b>Collection Discriminator</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings indicating the purposes of the collection of elements. Each string should be of the form :. Some examples include: 
	 * SNIA:Imported Volumes - to indicate that the volumes are for storage 
	 * SNIA:Target Volumes - to indicate that the volumes are target volumes of a replica pair 
	 * SNIA:Source Volumes - to indicate that the volumes are source volumes of a replica pair. 
	 * SNIA:Target Volume Group - to indicate that the group is a target of a replica pair. 
	 * SNIA:Source Volume Group - to indicate that thegroup is a source of a replica pair. 
	 * SNIA:Remote Storage Pools - to indicate that thethe storage pool is a pool for allocation of volumes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection Discriminator</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocatedResources_CollectionDiscriminator()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getCollectionDiscriminator();

} // CIM_AllocatedResources
