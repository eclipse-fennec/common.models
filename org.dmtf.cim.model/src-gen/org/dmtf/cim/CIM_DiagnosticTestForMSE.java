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
 * A representation of the model object '<em><b>CIM Diagnostic Test For MSE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is being deprecated to promote its usage to the DiagnosticService level. 
 * This is an association class that relates a DiagnosticTest to a ManagedSystemElement. Consumers wishing to 'diagnose' a particular Element could query this association, for the Element, to determine what tests are available.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticTestForMSE#getEstimatedTimeOfPerforming <em>Estimated Time Of Performing</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticTestForMSE#getIsExclusiveForMSE <em>Is Exclusive For MSE</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticTestForMSE()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_AvailableDiagnosticService\"]' Version='2.9.0' UMLPackagePath='CIM::System::Diagnostics' override.Antecedent='CIM_DiagnosticTest REF' override.Antecedent.Deprecated='[\"CIM_AvailableDiagnosticService.ServiceProvided\"]' override.Antecedent.Description='The test that may be run against a ManagedSystemElement.' override.Dependent='CIM_ManagedSystemElement REF' override.Dependent.Deprecated='[\"CIM_AvailableDiagnosticService.UserOfService\"]' override.Dependent.Description='The ManagedSystemElement that can be tested.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_DiagnosticTestForMSE extends CIM_ProvidesServiceToElement {
	/**
	 * Returns the value of the '<em><b>Estimated Time Of Performing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated number of seconds to perform the referenced DiagnosticTest against the ManagedSystemElement. Since execution times could vary by Element, this property is located in the association between the two entities. It is also captured in DiagnosticResult, in the EstimatedTimeOfPerforming property. 
	 * A CIM Consumer can compare this value with the value in DiagnosticResult to get an idea of what impact their settings have on test execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Estimated Time Of Performing</em>' attribute.
	 * @see #setEstimatedTimeOfPerforming(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticTestForMSE_EstimatedTimeOfPerforming()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_AvailableDiagnosticService.EstimatedDurationOfService\"]' Units='Seconds' ModelCorrespondence='[\"CIM_DiagnosticResult.EstimatedTimeOfPerforming\"]' PUnit='second'"
	 * @generated
	 */
	Long getEstimatedTimeOfPerforming();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticTestForMSE#getEstimatedTimeOfPerforming <em>Estimated Time Of Performing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Time Of Performing</em>' attribute.
	 * @see #getEstimatedTimeOfPerforming()
	 * @generated
	 */
	void setEstimatedTimeOfPerforming(Long value);

	/**
	 * Returns the value of the '<em><b>Is Exclusive For MSE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is being deprecated since the same characterisitic can be published in the CIM_ServiceAffectsElement.ElementEffects array as Value = 2, "Exclusive Use". 
	 * If the DiagnosticTest referenced in this object can be run concurrently against multiple SystemElements, but only run one at a time for the referenced ManagedSystemElement, then this boolean is set to TRUE. Alternately, if the test can NOT be run concurrently irregardless of the System Elements being tested, then the more general "Is Exclusive" enumerated value (2) should be set in DiagnosticTest. Characteristics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Exclusive For MSE</em>' attribute.
	 * @see #setIsExclusiveForMSE(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticTestForMSE_IsExclusiveForMSE()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_ServiceAffectsElement.ElementEffects\"]'"
	 * @generated
	 */
	Boolean getIsExclusiveForMSE();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticTestForMSE#getIsExclusiveForMSE <em>Is Exclusive For MSE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Exclusive For MSE</em>' attribute.
	 * @see #getIsExclusiveForMSE()
	 * @generated
	 */
	void setIsExclusiveForMSE(Boolean value);

} // CIM_DiagnosticTestForMSE
