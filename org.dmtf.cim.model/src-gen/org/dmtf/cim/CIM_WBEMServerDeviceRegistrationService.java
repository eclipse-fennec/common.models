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
 * A representation of the model object '<em><b>CIM WBEM Server Device Registration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This service contains the methods used to add and remove devices managed by a WBEM server.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_WBEMServerDeviceRegistrationService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Service' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_WBEMServerDeviceRegistrationService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Add a device to be managed by the WBEM server.
	 * @param Job Reference to the job created, if any.
	 * @param UseNamespace Namespace to use for the instances used to describe and manage the device. This namespace must exist.
	 * @param Addresses Address of the device (e.g. IP address(es) of array controller). Must have the same number of elements as Types[]. Cannot be null.
	 * @param PortNumbers Port number to use for each address given. Shall either be null if not applicable or shall ave one entry per entry in the Addresses array
	 * @param AddressTypes Enumeration indicating the format of the Addresses array 1: URI 2: IP Address 3: Fibre Channel World Wide Name 4: Unformatted Device Name.
	 * @param ElementName User-friendly name to give to the system. Corresponds to System.ElementName.
	 * @param Description Description of the system. Correspondes to System.Description
	 * @param secret Reference to existing credentials needed to access the device. Typically information like username/password.
	 * @param addedSystem Reference to the system added
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Job REF' Out='true'" UseNamespaceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" AddressesUnique="false" AddressesMany="true"
	 *        AddressesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'" PortNumbersUnique="false" PortNumbersMany="true"
	 *        PortNumbersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]'" AddressTypesUnique="false" AddressTypesMany="true"
	 *        AddressTypesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"..\",\"0x8000\"]' Values='[\"URI\",\"IP Address\",\"WWN\",\"Device Name\",\"DMTF/SNIA reserved\",\"Vendor specific\"]'" ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_System.ElementName\"]'" DescriptionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_System.Description\"]'" secretAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SharedSecret REF'" addedSystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_System REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"..\",\"0x1000\",\"0x1001..0x7FFF\",\"0x8000..0xFFFF\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"Invalid namespace\",\"Device profile not supported\",\"Vendor not supported\",\"Device not found\",\"Communication error\",\"Invalid credentials\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AddSystem(CIM_Job Job, String UseNamespace, EList<String> Addresses, EList<Long> PortNumbers, EList<Integer> AddressTypes, String ElementName, String Description, CIM_SharedSecret secret, CIM_System addedSystem);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Discover devices to be managed by the WBEM server.Exact parameters TBD.
	 * @param Job Reference to the job created, if any.
	 * @param UseNamespace Namespace to use for the instances used to describe and manage the device. This namespace must exist.
	 * @param secret Reference to existing credentials needed to access the device. Typically information like username/password.
	 * @param discoveredSystems Reference to systems discovered.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Job REF' Out='true'" UseNamespaceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" secretAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SharedSecret REF'" discoveredSystemsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_System REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"..\",\"0x1000\",\"0x1001..0x7FFF\",\"0x8000..0xFFFF\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"Invalid namespace\",\"Device profile not supported\",\"Vendor not supported\",\"Device not found\",\"Communication error\",\"Invalid credentials\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long DiscoverSystem(CIM_Job Job, String UseNamespace, CIM_SharedSecret secret, CIM_System discoveredSystems);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Remove a device from management by the WBEM server.
	 * @param Job Reference to the job created, if any.
	 * @param system Reference to existing computer system to be removed.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Job REF' Out='true'" systemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_System REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x1000\",\"0x1001..0x7FFF\",\"0x8000..0xFFFF\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RemoveSystem(CIM_Job Job, CIM_System system);

} // CIM_WBEMServerDeviceRegistrationService
