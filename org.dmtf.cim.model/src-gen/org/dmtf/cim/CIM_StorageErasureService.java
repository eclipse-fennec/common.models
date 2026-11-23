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
 * A representation of the model object '<em><b>CIM Storage Erasure Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This service contains the Erase method used to erase storage elements (StorageVolumes or LogicalDisks)
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageErasureService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Service' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_StorageErasureService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erase the contents of a storage element by using one of the supported erasure methods.
	 * @param Job Reference to the job created, if any
	 * @param Element StorageVolume or LogicalDisk to be erased
	 * @param ElementType Enumeration indicating the type of element being erased. 1: StorageVolume 2: LogicalDisk
	 * @param ErasureMethod Erasure method to use. This must match one of the methods listed in the ErasureConfigurationService's SupportedErasureMethods property. If NULL, then the DefaultErasureMethod from the ErasureCapabilites will be used as the erasure method
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Job REF' Out='true'" ElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF'" ElementTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\"]' Values='[\"StorageVolume\",\"LogicalDisk\"]'" ErasureMethodAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x1000\",\"0x1001..0x7FFF\",\"0x8000..0xFFFF\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long Erase(CIM_Job Job, CIM_StorageExtent Element, Integer ElementType, String ErasureMethod);

} // CIM_StorageErasureService
