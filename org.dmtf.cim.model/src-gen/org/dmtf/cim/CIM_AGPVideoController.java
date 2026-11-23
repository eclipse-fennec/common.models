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
 * A representation of the model object '<em><b>CIM AGP Video Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of an AGPVideoController.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AGPVideoController#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AGPVideoController#getNonlocalVideoMemorySize <em>Nonlocal Video Memory Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AGPVideoController#getLocalBusWidth <em>Local Bus Width</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AGPVideoController#getUsageModel <em>Usage Model</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AGPVideoController#getDataTransferRate <em>Data Transfer Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AGPVideoController#getAddressingMode <em>Addressing Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AGPVideoController#getMaximumAGPCommandQueuePath <em>Maximum AGP Command Queue Path</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AGPVideoController#getMaxNumberOfPipelinedAGPTransactions <em>Max Number Of Pipelined AGP Transactions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AGPVideoController#getGraphicsApertureSize <em>Graphics Aperture Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AGPVideoController#getAGPSpecificationVersionConformance <em>AGP Specification Version Conformance</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AGPVideoController()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.54.1' UMLPackagePath='CIM::Device::Controller' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_AGPVideoController extends CIM_VideoController {
	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property has been incorporated into the inherited AcceleratorCapabilities property. Capabilities of the AGP Graphics Controller. For example, the Device may support multiple monitors, PCI Mastering and large memory addresses. In this case, the values 3, 4 and 6 would be written to the Capabilities array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AGPVideoController_Capabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_VideoController.AcceleratorCapabilities\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Unknown\",\"Other\",\"PCI Fast Write\",\"MultiMonitor Support\",\"PCI Mastering\",\"Second Monochrome Adapter Support\",\"Large Memory Address Support\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_AGPVideoController.CapabilityDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Nonlocal Video Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Size of the non-local video memory in KB.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nonlocal Video Memory Size</em>' attribute.
	 * @see #setNonlocalVideoMemorySize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AGPVideoController_NonlocalVideoMemorySize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='KiloBytes' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getNonlocalVideoMemorySize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AGPVideoController#getNonlocalVideoMemorySize <em>Nonlocal Video Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nonlocal Video Memory Size</em>' attribute.
	 * @see #getNonlocalVideoMemorySize()
	 * @generated
	 */
	void setNonlocalVideoMemorySize(Long value);

	/**
	 * Returns the value of the '<em><b>Local Bus Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Width of the internal bus in the graphics Controller, in bits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Bus Width</em>' attribute.
	 * @see #setLocalBusWidth(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AGPVideoController_LocalBusWidth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bits' PUnit='bit'"
	 * @generated
	 */
	Long getLocalBusWidth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AGPVideoController#getLocalBusWidth <em>Local Bus Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Bus Width</em>' attribute.
	 * @see #getLocalBusWidth()
	 * @generated
	 */
	void setLocalBusWidth(Long value);

	/**
	 * Returns the value of the '<em><b>Usage Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer enumeration indicating the usage model of the graphics Controller. Usage model indicates how the Controller does manipulations of graphics surfaces, textures, etc. in memory. DMA indicates that the graphics Controller brings structures from the system memory to its local memory to perform needed manipulations or renderings. Execute specifies that the graphics Controller can directly access a specified region in main memory (called the graphics aperture) using GART - Graphics Aperture Remapping Table. It then performs manipulations in that range as if that whole graphics aperture were part of its local memory. A value of "Both" DMA and Execute models may also be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Model</em>' attribute.
	 * @see #setUsageModel(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AGPVideoController_UsageModel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Execute\",\"DMA\",\"Both\"]'"
	 * @generated
	 */
	Integer getUsageModel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AGPVideoController#getUsageModel <em>Usage Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Model</em>' attribute.
	 * @see #getUsageModel()
	 * @generated
	 */
	void setUsageModel(Integer value);

	/**
	 * Returns the value of the '<em><b>Data Transfer Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer enumeration indicating the data transfer rate of the graphics Controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Transfer Rate</em>' attribute.
	 * @see #setDataTransferRate(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AGPVideoController_DataTransferRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"1X\",\"2X\",\"4X\"]'"
	 * @generated
	 */
	Integer getDataTransferRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AGPVideoController#getDataTransferRate <em>Data Transfer Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Transfer Rate</em>' attribute.
	 * @see #getDataTransferRate()
	 * @generated
	 */
	void setDataTransferRate(Integer value);

	/**
	 * Returns the value of the '<em><b>Addressing Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer enumeration indicating the addressing mode of the graphics Controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addressing Mode</em>' attribute.
	 * @see #setAddressingMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AGPVideoController_AddressingMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Other\",\"Sideband\",\"Pipeline\"]'"
	 * @generated
	 */
	Integer getAddressingMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AGPVideoController#getAddressingMode <em>Addressing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addressing Mode</em>' attribute.
	 * @see #getAddressingMode()
	 * @generated
	 */
	void setAddressingMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Maximum AGP Command Queue Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of AGP Transaction requests that the master (AGP Graphics Controller) is allowed to enqueue into the target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum AGP Command Queue Path</em>' attribute.
	 * @see #setMaximumAGPCommandQueuePath(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AGPVideoController_MaximumAGPCommandQueuePath()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getMaximumAGPCommandQueuePath();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AGPVideoController#getMaximumAGPCommandQueuePath <em>Maximum AGP Command Queue Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum AGP Command Queue Path</em>' attribute.
	 * @see #getMaximumAGPCommandQueuePath()
	 * @generated
	 */
	void setMaximumAGPCommandQueuePath(Long value);

	/**
	 * Returns the value of the '<em><b>Max Number Of Pipelined AGP Transactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of AGP Transaction that the core logic (chipset) can accept into its transaction request queue from the Controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Number Of Pipelined AGP Transactions</em>' attribute.
	 * @see #setMaxNumberOfPipelinedAGPTransactions(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AGPVideoController_MaxNumberOfPipelinedAGPTransactions()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getMaxNumberOfPipelinedAGPTransactions();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AGPVideoController#getMaxNumberOfPipelinedAGPTransactions <em>Max Number Of Pipelined AGP Transactions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Of Pipelined AGP Transactions</em>' attribute.
	 * @see #getMaxNumberOfPipelinedAGPTransactions()
	 * @generated
	 */
	void setMaxNumberOfPipelinedAGPTransactions(Long value);

	/**
	 * Returns the value of the '<em><b>Graphics Aperture Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Size of the graphics aperture in KB.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graphics Aperture Size</em>' attribute.
	 * @see #setGraphicsApertureSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AGPVideoController_GraphicsApertureSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='KiloBytes' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getGraphicsApertureSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AGPVideoController#getGraphicsApertureSize <em>Graphics Aperture Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphics Aperture Size</em>' attribute.
	 * @see #getGraphicsApertureSize()
	 * @generated
	 */
	void setGraphicsApertureSize(Long value);

	/**
	 * Returns the value of the '<em><b>AGP Specification Version Conformance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string containing the AGP specification version to which this graphics Controller conforms.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AGP Specification Version Conformance</em>' attribute.
	 * @see #setAGPSpecificationVersionConformance(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AGPVideoController_AGPSpecificationVersionConformance()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAGPSpecificationVersionConformance();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AGPVideoController#getAGPSpecificationVersionConformance <em>AGP Specification Version Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AGP Specification Version Conformance</em>' attribute.
	 * @see #getAGPSpecificationVersionConformance()
	 * @generated
	 */
	void setAGPSpecificationVersionConformance(String value);

} // CIM_AGPVideoController
