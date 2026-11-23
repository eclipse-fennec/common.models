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
 * A representation of the model object '<em><b>CIM Composite Extent Based On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This specialization defines how data is striped across StorageExtents. Additionally, it includes information on distribution of check data so that the 'usual case' RAID devices can be created in one step.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CompositeExtentBasedOn#getLBAsMappedByDecrementing <em>LB As Mapped By Decrementing</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CompositeExtentBasedOn#getLBAMappingIncludesCheckData <em>LBA Mapping Includes Check Data</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CompositeExtentBasedOn#getNumberOfBlocks <em>Number Of Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CompositeExtentBasedOn#getBlockSize <em>Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CompositeExtentBasedOn#getUserDataStripeDepth <em>User Data Stripe Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CompositeExtentBasedOn#getUnitsBeforeCheckDataInterleave <em>Units Before Check Data Interleave</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CompositeExtentBasedOn#getUnitsOfCheckData <em>Units Of Check Data</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CompositeExtentBasedOn#getUnitsOfUserData <em>Units Of User Data</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CompositeExtentBasedOn()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.19.0' ClassConstraint='[\"inv: self.Dependent.IsComposite = true\"]' UMLPackagePath='CIM::Device::StorageExtents' override.Antecedent='CIM_StorageExtent REF' override.Antecedent.Min='1' override.Antecedent.Description='The underlying StorageExtent.' override.Dependent='CIM_StorageExtent REF' override.Dependent.Description='The StorageExtent which is built on the StorageExtent.' override.OrderIndex='uint16' override.OrderIndex.Required='true' override.OrderIndex.Description='Order matters to composite extents. An example of the use of this property is when defining a RAID-0 striped array of 3 disks. The resultant RAID array is a composite extent that is dependent on (as described by CompositeExtentBasedOn) the StorageExtents that represent each of the 3 disks. The OrderIndex of each CompositeExtentBasedOn association from the disk Extents to the RAID array could be specified as 1, 2 and 3 to indicate the order in which the disk Extents are used to access the RAID data.' override.OrderIndex.MappingStrings='[\"MIF.DMTF|Protected Space Extent|001.1\"]' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_CompositeExtentBasedOn extends CIM_BasedOn {
	/**
	 * Returns the value of the '<em><b>LB As Mapped By Decrementing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if logical blocks in the underlying StorageExtents are mapped in decrementing order. This property corresponds to the INCDEC value in the SCSI SCC-2 Volume Set PS_Extent Descriptor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LB As Mapped By Decrementing</em>' attribute.
	 * @see #setLBAsMappedByDecrementing(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CompositeExtentBasedOn_LBAsMappedByDecrementing()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getLBAsMappedByDecrementing();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CompositeExtentBasedOn#getLBAsMappedByDecrementing <em>LB As Mapped By Decrementing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LB As Mapped By Decrementing</em>' attribute.
	 * @see #getLBAsMappedByDecrementing()
	 * @generated
	 */
	void setLBAsMappedByDecrementing(Boolean value);

	/**
	 * Returns the value of the '<em><b>LBA Mapping Includes Check Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the logical block mapping algorithm includes check data bytes. This property corresponds to the NOCHKSKIP attribute in the SCC-2 Volume Set PS_Extent Descriptor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LBA Mapping Includes Check Data</em>' attribute.
	 * @see #setLBAMappingIncludesCheckData(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CompositeExtentBasedOn_LBAMappingIncludesCheckData()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getLBAMappingIncludesCheckData();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CompositeExtentBasedOn#getLBAMappingIncludesCheckData <em>LBA Mapping Includes Check Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LBA Mapping Includes Check Data</em>' attribute.
	 * @see #getLBAMappingIncludesCheckData()
	 * @generated
	 */
	void setLBAMappingIncludesCheckData(Boolean value);

	/**
	 * Returns the value of the '<em><b>Number Of Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of blocks that will be consumed on the Dependent Extent. This is limited by the Antecedent's NumberOfBlocks, but is included explicitly to provide for the DMTF MIF mapping. In SCSI SCC, this is equivalent to the NUMBER OF LBA_PS(s) field in the Volume Set PS_Extent Descriptor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Blocks</em>' attribute.
	 * @see #setNumberOfBlocks(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CompositeExtentBasedOn_NumberOfBlocks()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"MIF.DMTF|Protected Space Extent|001.3\"]' ModelCorrespondence='[\"CIM_StorageExtent.NumberOfBlocks\"]'"
	 * @generated
	 */
	Long getNumberOfBlocks();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CompositeExtentBasedOn#getNumberOfBlocks <em>Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Blocks</em>' attribute.
	 * @see #getNumberOfBlocks()
	 * @generated
	 */
	void setNumberOfBlocks(Long value);

	/**
	 * Returns the value of the '<em><b>Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Dependent's BlockSize is limited by the Antecedent's. In SCSI SCC, this is equivalent to the NUMBER OF BYTES PER LBA_PS field in the RedundancyGroup P_Extent Descriptor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Block Size</em>' attribute.
	 * @see #setBlockSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CompositeExtentBasedOn_BlockSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' MappingStrings='[\"MIF.DMTF|Protected Space Extent|001.4\"]' ModelCorrespondence='[\"CIM_StorageExtent.BlockSize\"]' PUnit='byte'"
	 * @generated
	 */
	Long getBlockSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CompositeExtentBasedOn#getBlockSize <em>Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Size</em>' attribute.
	 * @see #getBlockSize()
	 * @generated
	 */
	void setBlockSize(Long value);

	/**
	 * Returns the value of the '<em><b>User Data Stripe Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of bytes which form the stripe size for the Dependent StorageExtent. If the CompositeExtent is concatenated instead of striped, then UserDataStripeDepth should be set to zero.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Data Stripe Depth</em>' attribute.
	 * @see #setUserDataStripeDepth(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CompositeExtentBasedOn_UserDataStripeDepth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' MappingStrings='[\"MIF.DMTF|Protected Space Extent|001.6\"]' PUnit='byte'"
	 * @generated
	 */
	Long getUserDataStripeDepth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CompositeExtentBasedOn#getUserDataStripeDepth <em>User Data Stripe Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Data Stripe Depth</em>' attribute.
	 * @see #getUserDataStripeDepth()
	 * @generated
	 */
	void setUserDataStripeDepth(Long value);

	/**
	 * Returns the value of the '<em><b>Units Before Check Data Interleave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of bytes of user data to skip before starting the check data interleave.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Units Before Check Data Interleave</em>' attribute.
	 * @see #setUnitsBeforeCheckDataInterleave(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CompositeExtentBasedOn_UnitsBeforeCheckDataInterleave()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' MappingStrings='[\"MIF.DMTF|Physical Extent|001.6\"]' PUnit='byte'"
	 * @generated
	 */
	Long getUnitsBeforeCheckDataInterleave();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CompositeExtentBasedOn#getUnitsBeforeCheckDataInterleave <em>Units Before Check Data Interleave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units Before Check Data Interleave</em>' attribute.
	 * @see #getUnitsBeforeCheckDataInterleave()
	 * @generated
	 */
	void setUnitsBeforeCheckDataInterleave(Long value);

	/**
	 * Returns the value of the '<em><b>Units Of Check Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of bytes to be reserved for check data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Units Of Check Data</em>' attribute.
	 * @see #setUnitsOfCheckData(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CompositeExtentBasedOn_UnitsOfCheckData()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' MappingStrings='[\"MIF.DMTF|Physical Extent|001.7\"]' PUnit='byte'"
	 * @generated
	 */
	Long getUnitsOfCheckData();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CompositeExtentBasedOn#getUnitsOfCheckData <em>Units Of Check Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units Of Check Data</em>' attribute.
	 * @see #getUnitsOfCheckData()
	 * @generated
	 */
	void setUnitsOfCheckData(Long value);

	/**
	 * Returns the value of the '<em><b>Units Of User Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of bytes to be reserved for user data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Units Of User Data</em>' attribute.
	 * @see #setUnitsOfUserData(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CompositeExtentBasedOn_UnitsOfUserData()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' MappingStrings='[\"MIF.DMTF|Physical Extent|001.8\"]' PUnit='byte'"
	 * @generated
	 */
	Long getUnitsOfUserData();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CompositeExtentBasedOn#getUnitsOfUserData <em>Units Of User Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units Of User Data</em>' attribute.
	 * @see #getUnitsOfUserData()
	 * @generated
	 */
	void setUnitsOfUserData(Long value);

} // CIM_CompositeExtentBasedOn
