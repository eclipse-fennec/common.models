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
 * A representation of the model object '<em><b>CIM Configuration Reporting Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Service to provide reports on current configuration and potential for growth. The service may be used in several circumstances: 
 * - To report growth potential (how many can I have) 
 * - To report information on objects not directly modeled for performance or other reasons. 
 * It can also report counts of 'things' or counts of 'units'. For example, the number of disk drives could be reported or the capacity that they would provide.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ConfigurationReportingService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Device::StorageServices' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ConfigurationReportingService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a list of classes that the given Managed Element supports or has installed.
	 * @param InquiryType The type of inquiry to be performed.
	 * @param Recursive
	 *   False : Only report on elements directly contained in/attached to the given ManagedElement. 
	 *   True : Report on all objects contained in/attached to the given ManagedElement.
	 * @param Target The target of query, for example a rack or a chassis.
	 * @param ClassTypes Array containing the class names (typically the leaf classes) that the given ManagedElement can support or has installed.
	 * <!-- end-model-doc -->
	 * @model InquiryTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"2\",\"3\"]' Values='[\"Supports\",\"Installed\"]'" RecursiveAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true'" TargetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' In='true'" ClassTypesUnique="false" ClassTypesMany="true"
	 *        ClassTypesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetClassTypes(Integer InquiryType, Boolean Recursive, CIM_ManagedElement Target, EList<String> ClassTypes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a list of UnitTypes that are installed for a given ClassType on a given ManagedElement.
	 * @param InquiryType The type of inquiry to be performed.
	 * @param Recursive
	 *   False : Only report on elements directly contained in/attached to the given ManagedElement. 
	 *   True : Report on all objects contained in/attached to the given ManagedElement.
	 * @param Target The target of query, for example a rack or a chassis.
	 * @param ClassType The ClassType for the query. This should be a entry returned in the GetClassTypes.ClassTypes property.
	 * @param UnitTypes A list of supported UnitTypes.
	 * <!-- end-model-doc -->
	 * @model InquiryTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"2\",\"3\"]' Values='[\"Supported\",\"Installed\"]'" RecursiveAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true'" TargetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' In='true'" ClassTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'" UnitTypesUnique="false" UnitTypesMany="true"
	 *        UnitTypesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' In='false' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"32768..65535\"]' Values='[\"None\",\"Front Side\",\"Back Side\",\"Contained\",\"Connected\",\"I/O\",\"Memory\",\"StorageMediaLocation\",\"Megabytes\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_ConfigurationReportingService.ReportCapacity(UnitType)\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetUnitTypes(Integer InquiryType, Boolean Recursive, CIM_ManagedElement Target, String ClassType, EList<Integer> UnitTypes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the maximum number supported or the number of currently installed units for the given UnitType, for a given ClassType on a given ManagedElement.
	 * @param InquiryType The type of inquiry to be performed.
	 * @param Recursive
	 *   False : Only report on elements directly contained in/attached to the given ManagedElement. 
	 *   True : Report on all objects contained in/attached to the given ManagedElement.
	 * @param Target The target of query, for example a rack or a chassis.
	 * @param ClassType The ClassType for the query. This should be a entry returned in the GetClassTypes.ClassTypes property.
	 * @param UnitType The UnitType for the query.
	 * @param NumberOfUnits The maximum number of supported or the number of currently installed units.
	 * <!-- end-model-doc -->
	 * @model InquiryTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"2\",\"3\"]' Values='[\"Supported\",\"Installed\"]'" RecursiveAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true'" TargetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' In='true'" ClassTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'" UnitTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"32768..65535\"]' Values='[\"None\",\"Front Side\",\"Back Side\",\"Contained\",\"Connected\",\"I/O\",\"Memory\",\"StorageMediaLocation\",\"Megabytes\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_ConfigurationReportingService.GetUnitTypes(UnitTypes)\"]'" NumberOfUnitsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ReportCapacity(Integer InquiryType, Boolean Recursive, CIM_ManagedElement Target, String ClassType, Integer UnitType, Long NumberOfUnits);

} // CIM_ConfigurationReportingService
