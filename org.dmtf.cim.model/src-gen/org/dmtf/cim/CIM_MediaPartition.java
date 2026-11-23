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
 * A representation of the model object '<em><b>CIM Media Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A MediaPartition is a presentation of a contiguous range of logical blocks and has identifying data written on/to it. It may include a signature written by the OS or by an application. This class is a common superclass for Disk and TapePartions. Partitions are directly realized by Physical Media (indicated by the RealizesExtent association) or built on StorageVolumes (indicated by the BasedOn association).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MediaPartition#getBootable <em>Bootable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPartition#getAllocatable <em>Allocatable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPartition#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPartition#getSignatureAlgorithm <em>Signature Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPartition#getSignatureState <em>Signature State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaPartition#getExtendable <em>Extendable</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MediaPartition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Device::StorageExtents' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_MediaPartition extends CIM_StorageExtent {
	/**
	 * Returns the value of the '<em><b>Bootable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the Partition is labeled as bootable. (Note that this does not mean that an Operating System is actually loaded on the Partition.) With the advent of bootable Tape and other bootable media, this property is included in the higher level MediaPartition class, rather than in a subclass such as DiskPartition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bootable</em>' attribute.
	 * @see #setBootable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPartition_Bootable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getBootable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPartition#getBootable <em>Bootable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bootable</em>' attribute.
	 * @see #getBootable()
	 * @generated
	 */
	void setBootable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allocatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the Partition is available and may be allocated for use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocatable</em>' attribute.
	 * @see #setAllocatable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPartition_Allocatable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getAllocatable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPartition#getAllocatable <em>Allocatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocatable</em>' attribute.
	 * @see #getAllocatable()
	 * @generated
	 */
	void setAllocatable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifying string written to the Partition. Additional information related to this 'Signature' may be found in the properties, SignatureState and SignatureAlgorithm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPartition_Signature()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_MediaPartition.SignatureState\",\"CIM_MediaPartition.SignatureAlgorithm\"]'"
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPartition#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>Signature Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string describing the algorithm used to define the Partition Signature. The value of this property is dependent on the Signature's State.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature Algorithm</em>' attribute.
	 * @see #setSignatureAlgorithm(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPartition_SignatureAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_MediaPartition.Signature\",\"CIM_MediaPartition.SignatureState\"]'"
	 * @generated
	 */
	String getSignatureAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPartition#getSignatureAlgorithm <em>Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Algorithm</em>' attribute.
	 * @see #getSignatureAlgorithm()
	 * @generated
	 */
	void setSignatureAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Signature State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration describing the state of the Partition's identifying Signature string. Information such as "Uninitialized" (value=2), or "Assigned by Owning Application" (value=5) are possible entries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature State</em>' attribute.
	 * @see #setSignatureState(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPartition_SignatureState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Unimplemented\",\"Uninitialized\",\"Calculated by Operating System\",\"Calculated by a Media Manager\",\"Assigned by Owning Application\"]' ModelCorrespondence='[\"CIM_MediaPartition.Signature\",\"CIM_MediaPartition.SignatureAlgorithm\"]'"
	 * @generated
	 */
	String getSignatureState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPartition#getSignatureState <em>Signature State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature State</em>' attribute.
	 * @see #getSignatureState()
	 * @generated
	 */
	void setSignatureState(String value);

	/**
	 * Returns the value of the '<em><b>Extendable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the Partition can be grown/extended without reformatting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extendable</em>' attribute.
	 * @see #setExtendable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPartition_Extendable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getExtendable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPartition#getExtendable <em>Extendable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extendable</em>' attribute.
	 * @see #getExtendable()
	 * @generated
	 */
	void setExtendable(Boolean value);

} // CIM_MediaPartition
