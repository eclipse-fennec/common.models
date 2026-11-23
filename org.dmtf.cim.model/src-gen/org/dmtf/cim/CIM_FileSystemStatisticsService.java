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
 * A representation of the model object '<em><b>CIM File System Statistics Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of StatisticsService that provides services for filtering and retrieving statistics from a StatisticsManifestCollection that contains instances of FileSystemStatisticalData.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileStatistics' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_FileSystemStatisticsService extends CIM_StatisticsService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves statistics in a well-defined bulk format. The collection of statistics returned is determined by the list of element types passed in to the method and the manifests for those types contained in the supplied FileSystemStatisticsManifestCollection. If both the Elements and FileSystemStatisticsManifestCollection parameters are supplied, then the types of elements returned is an intersection of the element types listed in the Elements parameter and the types for which FileSystemStatisticsManifest instances exist in the supplied FileSystemStatisticsManifestCollection. The statistics are returned through a well-defined array of strings, whose format is specified by the StatisticsFormat parameter, that can be parsed to retrieve the desired statistics as well as limited information about the elements that those metrics describe.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param ElementTypes Element types for which statistics should be returned. If not supplied (i.e., parameter is null), then this parameter is not considered when filtering the instances of StatisticalData that will populate the Statistics output parameter. If the array is not null, but is empty, then no statistics will be returned by this method. A client SHOULD NOT specify this parameter if it is not meaningful (i.e., the service only provides statistics for a single type of element).
	 * @param OtherElementTypeDescriptions An array of strings that specify the particular "Other" element(s) when the ElementType property above includes the ElementType value of 1 (i.e., "Other"). Each string within this array identifies a separate "Other" element and duplicate string values are NOT allowed. This property should be set to NULL when the ElementType property does not include the value of 1.
	 * @param ManifestCollection The FileSystemStatisticsManifestCollection that contains the manifests that list the metrics to be returned for each element type. If not supplied (i.e., parameter is null), then all available statistics will be returned unfiltered. Only elements that match the element type properties (if meaningful) of the FileSystemStatisticsManifest instances contained within the FileSystemStatisticsManifestCollection will have data returned by this method. If the supplied FileSystemStatisticsManifestCollection does not contain any FileSystemStatisticsManifest instances, then no statistics will be returned by this method.
	 * @param StatisticsFormat
	 *   Specifies the format of the Statistics output parameter. 
	 *   - CSV = Comma Separated Values.
	 * @param Statistics The statistics for all the elements as determined by the Elements, ManifestCollection parameters, and StatisticsFormat parameters.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" ElementTypesUnique="false" ElementTypesMany="true"
	 *        ElementTypesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"102\",\"103\",\"104\",\"..\",\"0x8000..\"]' Values='[\"Other\",\"Local Filesystem\",\"Exported File Share\",\"Exporting Port\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.ElementType\"]'" OtherElementTypeDescriptionsUnique="false" OtherElementTypeDescriptionsMany="true"
	 *        OtherElementTypeDescriptionsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.OtherElementTypeDescription\"]'" ManifestCollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_FileSystemStatisticsManifestCollection REF'" StatisticsFormatAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"CSV\",\"DMTF Reserved\",\"Vendor Specific\"]'" StatisticsUnique="false" StatisticsMany="true"
	 *        StatisticsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Out='true' ModelCorrespondence='[\"CIM_FileSystemStatisticsService.GetStatisticsCollection(ElementTypes)\",\"CIM_FileSystemStatisticsService.GetStatisticsCollection(ManifestCollection)\",\"CIM_FileSystemStatisticsService.GetStatisticsCollection(StatisticsFormat)\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"4096\",\"4097\",\"4098\",\"4099..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Method Reserved\",\"Method Parameters Checked - Job Started\",\"Element Not Supported\",\"Statistics Format Not Supported\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetStatisticsCollection(CIM_ConcreteJob Job, EList<Integer> ElementTypes, EList<String> OtherElementTypeDescriptions, CIM_FileSystemStatisticsManifestCollection ManifestCollection, Integer StatisticsFormat, EList<String> Statistics);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a new FileSystemStatisticsManifestCollection instance, whose members can serve as a filter for metrics retrieved through the GetStatisticsCollection method.
	 * @param Statistics The collection of statistics that will be filtered using the new FileSystemStatisticsManifestCollection.
	 * @param ElementName Client-defined name for the new FileSystemStatisticsManifestCollection.
	 * @param ManifestCollection Reference to the new FileSystemStatisticsManifestCollection.
	 * <!-- end-model-doc -->
	 * @model StatisticsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StatisticsCollection REF'" ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" ManifestCollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_FileSystemStatisticsManifestCollection REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..32767\",\"32768..65535\"]' Values='[\"Ok\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateManifestCollection(CIM_StatisticsCollection Statistics, String ElementName, CIM_FileSystemStatisticsManifestCollection ManifestCollection);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that creates or modifies a FileSystemStatisticsManifest for this statistics service. A client supplies a FileSystemStatisticsManifestCollection in which the new FileSystemStatisticsManifest will be placed or an existing FileSystemStatisticsManifest will be modified, the element type of the statistics that the FileSystemStatisticsManifest will filter, and a list of metrics, which serves as a filter for statistical data of that element type.
	 * @param ManifestCollection FileSystemStatisticsManifestCollection that the FileSystemStatisticsManifest is or should be a member of.
	 * @param ElementType The type of elements whose statistics the FileSystemStatisticsManifest will filter.
	 * @param OtherElementTypeDescription A string describing the type of element when the ElementType property above is set to 1 (i.e., "Other"). This property should be set to NULL when the ElementType property is any value other than 1.
	 * @param ElementName A client-defined string that identifies the FileSystemStatisticsManifest created or modified by this method.
	 * @param StatisticsList The metrics that will be included by the filter. The metrics supplied here are the properties of CIM_FileSystemStatisticalData or one of its subclasses that will remain after the FileSystemStatisticsManifest filter is applied. If this array parameter is empty, then only InstanceID and ElementType will be returned when the manifest is referenced. If this parameter is NULL, then all supported metrics is assumed (i.e., all supported metric properties will be included; note that this would be the FileSystemStatisticsManifest from the default manifest collection).
	 * @param Manifest The FileSystemStatisticsManifest that is created or modified on successful execution of the method.
	 * <!-- end-model-doc -->
	 * @model ManifestCollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_FileSystemStatisticsManifestCollection REF'" ElementTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"102\",\"103\",\"104\",\"..\",\"0x8000..\"]' Values='[\"Other\",\"Local Filesystem\",\"Exported File Share\",\"Exporting Port\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_FileSystemStatisticsManifest.ElementType\"]'" OtherElementTypeDescriptionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' ModelCorrespondence='[\"CIM_FileSystemStatisticsManifest.OtherElementTypeDescription\"]'" ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" StatisticsListUnique="false" StatisticsListMany="true"
	 *        StatisticsListAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'" ManifestAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_FileSystemStatisticsManifest REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"4096\",\"4097\",\"4098\",\"4099..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Method Reserved\",\"Element Not Supported\",\"Metric not supported\",\"ElementType Parameter Missing\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AddOrModifyManifest(CIM_FileSystemStatisticsManifestCollection ManifestCollection, Integer ElementType, String OtherElementTypeDescription, String ElementName, EList<String> StatisticsList, CIM_FileSystemStatisticsManifest Manifest);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extrinsic method that removes manifests from a FileSystemStatisticsManifestCollection.
	 * @param ManifestCollection FileSystemStatisticsManifestCollection from which the FileSystemStatisticsManifests will be removed.
	 * @param Manifests List of FileSystemStatisticsManifests to be removed from the FileSystemStatisticsManifestCollection.
	 * <!-- end-model-doc -->
	 * @model ManifestCollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_FileSystemStatisticsManifestCollection REF'" ManifestsUnique="false" ManifestsMany="true"
	 *        ManifestsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_FileSystemStatisticsManifest REF[]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Method Reserved\",\"Manifest not found\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RemoveManifests(CIM_FileSystemStatisticsManifestCollection ManifestCollection, EList<CIM_FileSystemStatisticsManifest> Manifests);

} // CIM_FileSystemStatisticsService
