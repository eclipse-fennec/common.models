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
 * A representation of the model object '<em><b>CIM Operational Power Statistics Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of StatisticsService that provides services for filtering and retrieving statistics from a StatisticsManifestCollection that contains instances of OperationalPowerStatisticalData.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OperationalPowerStatisticsService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Power' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_OperationalPowerStatisticsService extends CIM_StatisticsService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves statistics in a well-defined bulk format. The collection of statistics returned is determined by the list of element types passed in to the method and the manifests for those types contained in the supplied OperationalPowerManifestCollection. If both the Elements and OperationalPowerManifestCollection parameters are supplied, then the types of elements returned is an intersection of the element types listed in the Elements parameter and the types for which OperationalPowerManifest instances exist in the supplied OperationalPowersManifestCollection. The statistics are returned through a well-defined array of strings, whose format is specified by the StatisticsFormat parameter, that can be parsed to retrieve the desired statistics as well as limited information about the elements that those metrics describe.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param ElementTypes Element types for which statistics should be returned. If not supplied (i.e. parameter is null) this parameter is not considered when filtering the instances of StatisticalData that will populate the Statistics output parameter. If the array is not null, but is empty, then no statistics will be returned by this method. A client SHOULD NOT specify this parameter if it is not meaningful (i.e. the service only provides statistics for a single type of element).
	 * @param ManifestCollection The OperationalPowerManifestCollection that contains the manifests that list the metrics to be returned for each element type. If not supplied (i.e. parameter is null), then all available statistics will be returned unfiltered. Only elements that match the element type properties (if meaningful) of the OperationalPowerManifest instances contained within the OperationalPowerManifestCollection will have data returned by this method. If the supplied OperationalPowerManifestCollection does not contain any OperationalPowerStatisticsManifest instances, then no statistics will be returned by this method.
	 * @param StatisticsFormat
	 *   Specifies the format of the Statistics output parameter. 
	 *   - CSV = Comma Separated Values.
	 * @param Statistics The statistics for all the elements as determined by the Elements, ManifestCollection parameters, and StatisticsFormat parameters.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" ElementTypesUnique="false" ElementTypesMany="true"
	 *        ElementTypesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"10\",\"201\",\"202\",\"203\",\"204\",\"205\",\"206\",\"207\",\"..\",\"0x8000..\"]' Values='[\"Computer System\",\"Disk Drive\",\"PDU\",\"Power Supply\",\"Fan\",\"CPU\",\"RAID Group\",\"Disk Tray\",\"Controller\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_OperationalPowerStatisticalData.ElementType\"]'" ManifestCollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_OperationalPowerManifestCollection REF'" StatisticsFormatAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"CSV\",\"DMTF Reserved\",\"Vendor Specific\"]'" StatisticsUnique="false" StatisticsMany="true"
	 *        StatisticsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Out='true' ModelCorrespondence='[\"CIM_OperationalPowerStatisticsService.GetStatisticsCollection(ElementTypes)\",\"CIM_OperationalPowerStatisticsService.GetStatisticsCollection(ManifestCollection)\",\"CIM_OperationalPowerStatisticsService.GetStatisticsCollection(StatisticsFormat)\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"4096\",\"4097\",\"4098\",\"4099..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Method Reserved\",\"Method Parameters Checked - Job Started\",\"Element Not Supported\",\"Statistics Format Not Supported\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetStatisticsCollection(CIM_ConcreteJob Job, EList<Integer> ElementTypes, CIM_OperationalPowerManifestCollection ManifestCollection, Integer StatisticsFormat, EList<String> Statistics);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a new OperationalPowerManifestCollection instance, whose members can serve as a filter for metrics retrieved through the GetStatisticsCollection method.
	 * @param Statistics The collection of statistics that will be filtered using the new OperationalPowerManifestCollection.
	 * @param ElementName Client-defined name for the new OperationalPowerManifestCollection.
	 * @param ManifestCollection Reference to the new OperationalPowerManifestCollection.
	 * <!-- end-model-doc -->
	 * @model StatisticsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StatisticsCollection REF'" ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" ManifestCollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_OperationalPowerManifestCollection REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..32767\",\"32768..65535\"]' Values='[\"Ok\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateManifestCollection(CIM_StatisticsCollection Statistics, String ElementName, CIM_OperationalPowerManifestCollection ManifestCollection);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that creates or modifies a OperationalPowerManifest for this statistics service. A client supplies a OperationalPowerManifestCollection in which the new OperationalPowerManifest will be placed or an existing OperationalPowerManifest will be modified, the element type of the statistics that the OperationalPowerManifest will filter, and a list of metrics, which serves as a filter for statistical data of that element type.
	 * @param ManifestCollection OperationalPowerManifestCollection that the OperationalPowerManifest is or should be a member of.
	 * @param ElementType The type of elements whose statistics the OperationalPowerManifest will filter.
	 * @param ElementName A client-defined string that identifies the OperationalPowerManifest created or modified by this method.
	 * @param StatisticsList The metrics that will be included by the filter. The metrics supplied here are the properties of CIM_StatisticalData or one of its subclasses that will remain after the OperationalPowerManifest filter is applied.
	 * @param Manifest The OperationalPowerManifest that is created or modified on successful execution of the method.
	 * <!-- end-model-doc -->
	 * @model ManifestCollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_OperationalPowerManifestCollection REF'" ElementTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"10\",\"201\",\"202\",\"203\",\"204\",\"205\",\"206\",\"207\",\"..\",\"0x8000..\"]' Values='[\"Computer System\",\"Disk Drive\",\"PDU\",\"Power Supply\",\"Fan\",\"CPU\",\"RAID Group\",\"Disk Tray\",\"Controller\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_OperationalPowerManifest.ElementType\"]'" ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" StatisticsListUnique="false" StatisticsListMany="true"
	 *        StatisticsListAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'" ManifestAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_OperationalPowerManifest REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"4096\",\"4097\",\"4098\",\"4099..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Method Reserved\",\"Element Not Supported\",\"Metric not supported\",\"ElementType Parameter Missing\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AddOrModifyManifest(CIM_OperationalPowerManifestCollection ManifestCollection, Integer ElementType, String ElementName, EList<String> StatisticsList, CIM_OperationalPowerManifest Manifest);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extrinsic method that removes manifests from a OperationalPowerManifestCollection.
	 * @param ManifestCollection OperationalPowerManifestCollection from which the OperationalPowerManifests will be removed.
	 * @param Manifests List of OperationalPowerManifests to be removed from the OperationalPowerManifestCollection.
	 * <!-- end-model-doc -->
	 * @model ManifestCollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_OperationalPowerManifestCollection REF'" ManifestsUnique="false" ManifestsMany="true"
	 *        ManifestsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_OperationalPowerManifest REF[]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Method Reserved\",\"Manifest not found\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RemoveManifests(CIM_OperationalPowerManifestCollection ManifestCollection, EList<CIM_OperationalPowerManifest> Manifests);

} // CIM_OperationalPowerStatisticsService
