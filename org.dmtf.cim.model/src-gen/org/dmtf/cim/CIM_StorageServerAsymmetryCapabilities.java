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
 * A representation of the model object '<em><b>CIM Storage Server Asymmetry Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class defines the asymmetric characteristics and capabilites of a redundant storage server. The properties in this class guide client algorithms in the interpretation of the instances of StorageResourceLoadGroup, TargetPortGroup, StorageProcessorAffinity, and AsymmetricAccessibility, and also determining support for methods that affect assignment of storage resources to storage processors.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageServerAsymmetryCapabilities#getStorageResourceSymmetryCapability <em>Storage Resource Symmetry Capability</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageServerAsymmetryCapabilities#getStorageResourceType <em>Storage Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageServerAsymmetryCapabilities#getStorageResourceAffinityAssignable <em>Storage Resource Affinity Assignable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageServerAsymmetryCapabilities#getPortGroupFailoverBehavior <em>Port Group Failover Behavior</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageServerAsymmetryCapabilities#getTargetPortSymmetryCapability <em>Target Port Symmetry Capability</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageServerAsymmetryCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StorageServerAsymmetryCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Storage Resource Symmetry Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this property is set to Symmetric it indicates that the StoragePools or StorageVolumes are processed in a distributed load-balanced manner between storage processors. If this property is set to Asymmetric it indicates that the StoragePools or StorageVolumes are have a primary affinity for one storage processor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Resource Symmetry Capability</em>' attribute.
	 * @see #setStorageResourceSymmetryCapability(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageServerAsymmetryCapabilities_StorageResourceSymmetryCapability()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\"]' Values='[\"Symmetric\",\"Asymmetric\"]'"
	 * @generated
	 */
	Integer getStorageResourceSymmetryCapability();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageServerAsymmetryCapabilities#getStorageResourceSymmetryCapability <em>Storage Resource Symmetry Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Resource Symmetry Capability</em>' attribute.
	 * @see #getStorageResourceSymmetryCapability()
	 * @generated
	 */
	void setStorageResourceSymmetryCapability(Integer value);

	/**
	 * Returns the value of the '<em><b>Storage Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this property is set to StorageVolume it indicates that the StoragePools have symmetric behavior(or no affinity) and that the Volumes have affintiy for one storage processor or the other. If this property is set to StoragePool it indicates that a StoragePool as well as the Volumes allocated from it have affinity for one storage processor or the other.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Resource Type</em>' attribute.
	 * @see #setStorageResourceType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageServerAsymmetryCapabilities_StorageResourceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\"]' Values='[\"StorageVolume\",\"StoragePool\"]'"
	 * @generated
	 */
	Integer getStorageResourceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageServerAsymmetryCapabilities#getStorageResourceType <em>Storage Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Resource Type</em>' attribute.
	 * @see #getStorageResourceType()
	 * @generated
	 */
	void setStorageResourceType(Integer value);

	/**
	 * Returns the value of the '<em><b>Storage Resource Affinity Assignable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if this storage system allows the client to specify which storage processor a storage resource is assigned to, either using one of the CreateOrModify methods or the AssignStorageResourceAffinity method on StorageConfigurationService.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Resource Affinity Assignable</em>' attribute.
	 * @see #setStorageResourceAffinityAssignable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageServerAsymmetryCapabilities_StorageResourceAffinityAssignable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getStorageResourceAffinityAssignable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageServerAsymmetryCapabilities#getStorageResourceAffinityAssignable <em>Storage Resource Affinity Assignable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Resource Affinity Assignable</em>' attribute.
	 * @see #getStorageResourceAffinityAssignable()
	 * @generated
	 */
	void setStorageResourceAffinityAssignable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Port Group Failover Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies whether a storage server supports transparent or non-transparent failover of TargetPortGroups. If this value is 2(Port Group Fails), a TargetPortGroup will have a single StorageProcessorAffinity association to the storage processor it belongs to and will fail with. If this property has a value of 3, the TargetPortGroup will have a StorageProcessorAffinity association to each storage processor that can host it's function, and the properties on the association will indicate both which processor is primary and which is currently hosting the ports in the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Group Failover Behavior</em>' attribute.
	 * @see #setPortGroupFailoverBehavior(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageServerAsymmetryCapabilities_PortGroupFailoverBehavior()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\"]' Values='[\"Port Group Fails\",\"Port Group Fails Over Transparently\"]'"
	 * @generated
	 */
	Integer getPortGroupFailoverBehavior();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageServerAsymmetryCapabilities#getPortGroupFailoverBehavior <em>Port Group Failover Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Group Failover Behavior</em>' attribute.
	 * @see #getPortGroupFailoverBehavior()
	 * @generated
	 */
	void setPortGroupFailoverBehavior(Integer value);

	/**
	 * Returns the value of the '<em><b>Target Port Symmetry Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates the normal(healthy) state accessibility to volumes both in the StorageResourceLoadGroup on the same storage processor as a TargetPortGroup, and to volumes in StorageResourceLoadGroups on 'other' storage processors in the redundant server. If this values is 2(Symmetric): There is equal bandwidth access to volumes on all storage processors through target ports on this storage processor. If this value is 3(Asymmetric Non-Optimized): There is full bandwidth access to volumes in the StorageResourceLoadGroup on the same storage processor as the TargetPortGroup and degraded bandwidth access to volumes in the StorageResourceLoadGroups on the 'other' storage processors. If this value is 4(Asymmetric No Access): There is full bandwidth access to volumes in the StorageResourceLoadGroup on the same storage processor as the TargetPortGroup and no access to volumes on 'other' storage processors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Port Symmetry Capability</em>' attribute.
	 * @see #setTargetPortSymmetryCapability(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageServerAsymmetryCapabilities_TargetPortSymmetryCapability()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"Symmetric\",\"Asymmetric Non-Optimized\",\"Asymmetric No Access\"]'"
	 * @generated
	 */
	Integer getTargetPortSymmetryCapability();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageServerAsymmetryCapabilities#getTargetPortSymmetryCapability <em>Target Port Symmetry Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Port Symmetry Capability</em>' attribute.
	 * @see #getTargetPortSymmetryCapability()
	 * @generated
	 */
	void setTargetPortSymmetryCapability(Integer value);

} // CIM_StorageServerAsymmetryCapabilities
