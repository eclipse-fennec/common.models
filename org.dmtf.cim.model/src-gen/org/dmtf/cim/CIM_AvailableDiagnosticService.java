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
 * A representation of the model object '<em><b>CIM Available Diagnostic Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is an association class that relates a DiagnosticService to a ManagedElement. Consumers wishing to 'diagnose' a particular Element could query this association to determine what services are available.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AvailableDiagnosticService#getEstimatedDurationOfService <em>Estimated Duration Of Service</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AvailableDiagnosticService#getEstimatedDurationQualifier <em>Estimated Duration Qualifier</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AvailableDiagnosticService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.11.0' UMLPackagePath='CIM::System::Diagnostics' override.ServiceProvided='CIM_DiagnosticService REF' override.ServiceProvided.Description='The diagnostic service that is available to a ManagedElement.' keys='ServiceProvided,UserOfService'"
 * @generated
 */
@ProviderType
public interface CIM_AvailableDiagnosticService extends CIM_ServiceAvailableToElement {
	/**
	 * Returns the value of the '<em><b>Estimated Duration Of Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated magnitude of time to perform the referenced DiagnosticService on the referenced ManagedElement. 
	 * Since the processing speed of a system can vary immensely due to a variety of factors (e.g., processor speed), this property takes on values that are a statement of magnitude, not absolute time. If greater accuracy can be provided, a quantification may be specified in the corresponding integer property, EstimatedDurationQualifier. 
	 * Since execution times could vary by Element, this property is located in the association between the two entities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Estimated Duration Of Service</em>' attribute.
	 * @see #setEstimatedDurationOfService(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AvailableDiagnosticService_EstimatedDurationOfService()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Unknown\",\"Milliseconds\",\"Seconds\",\"Minutes\",\"Hours\",\"Days\"]' ModelCorrespondence='[\"CIM_AvailableDiagnosticService.EstimatedDurationQualifier\"]'"
	 * @generated
	 */
	Integer getEstimatedDurationOfService();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AvailableDiagnosticService#getEstimatedDurationOfService <em>Estimated Duration Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Duration Of Service</em>' attribute.
	 * @see #getEstimatedDurationOfService()
	 * @generated
	 */
	void setEstimatedDurationOfService(Integer value);

	/**
	 * Returns the value of the '<em><b>Estimated Duration Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EstimatedDurationQualifier can be used to further quantify the magnitude of time to perform the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Estimated Duration Qualifier</em>' attribute.
	 * @see #setEstimatedDurationQualifier(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AvailableDiagnosticService_EstimatedDurationQualifier()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_AvailableDiagnosticService.EstimatedDurationOfService\"]'"
	 * @generated
	 */
	Long getEstimatedDurationQualifier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AvailableDiagnosticService#getEstimatedDurationQualifier <em>Estimated Duration Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Duration Qualifier</em>' attribute.
	 * @see #getEstimatedDurationQualifier()
	 * @generated
	 */
	void setEstimatedDurationQualifier(Long value);

} // CIM_AvailableDiagnosticService
