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
 * A representation of the model object '<em><b>CIM J2ee Statistic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The J2eeStatistic class is a base class that defines the properties that are common to all J2EE statistics. The JSR77 specification defines a set of statistical types, then it defines each J2EE statistic in terms of these types. Since CIM does not support multiple inheritance or embedded objects, the count, time, range, bounded range, and boundary statistics defined have been broken out into individual properties for each statistic that is defined in the JSR77 specification. 
 * Many of the properties defined for J2EE statistics are inherited from the CIM_StatisticalData class. Some of the inherited properties are CIM dates, which are not consistent with the definitions in the JSR77 specification. In order to minimize implementation differences, methods are defined to provide the dates as specified. Some of the subclasses of CIM_J2EEStatistic do not add any new properties. However, these subclasses were chosen over adding a type property to the superclass because the vendor extensions were likely to result in classes with characteristics distinct enough to warrant the existence of subclasses.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeStatistic()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServerStats' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeStatistic extends CIM_StatisticalData {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time the first measurement was taken represented as a long, whose value is the number of milliseconds since January 1, 1970,00:00:00. This method converts the StartStatisticTime property to the format defined in the JSR77 specification. The related property CIM_StatisticalData.StartStatisticTime represents the same information as a CIMDatetime entity.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.4.1.4 getStartTime|V1.0\"]' ModelCorrespondence='[\"CIM_StatisticalData.StartStatisticTime\"]'"
	 * @generated
	 */
	Long GetStartTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time the most recent measurement was taken represented as a long, whose value is the number of milliseconds since January 1, 1970,00:00:00. This method converts the StatisticTime property to the format defined in the JSR77 specification. The related property CIM_StatisticalData.StatisticTime represents the same information as a CIMDatatime entity.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.4.1.5 getLastSampleTime|V1.0\"]' ModelCorrespondence='[\"CIM_StatisticalData.StatisticTime\"]'"
	 * @generated
	 */
	Long GetLastSampleTime();

} // CIM_J2eeStatistic
