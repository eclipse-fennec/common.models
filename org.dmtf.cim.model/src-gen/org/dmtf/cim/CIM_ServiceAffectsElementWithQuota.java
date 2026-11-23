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
 * A representation of the model object '<em><b>CIM Service Affects Element With Quota</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ServiceAffectsElementWithQuota represents an extension of ServiceAffectsElement to include a quota imposed on the AffectedElement by the Service. The quota governs the amount of a resource controlled by the Service that can be allocated by the AffectedElement in one or more allocations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ServiceAffectsElementWithQuota#getQuota <em>Quota</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ServiceAffectsElementWithQuota#getQuotaUsed <em>Quota Used</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ServiceAffectsElementWithQuota#getQuotaUnits <em>Quota Units</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ServiceAffectsElementWithQuota()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.22.0' UMLPackagePath='CIM::Core::Service' keys='AffectedElement,AffectingElement'"
 * @generated
 */
@ProviderType
public interface CIM_ServiceAffectsElementWithQuota extends CIM_ServiceAffectsElement {
	/**
	 * Returns the value of the '<em><b>Quota</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quota is the maximum number of resource units that may be allocated to the AffectedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quota</em>' attribute.
	 * @see #setQuota(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ServiceAffectsElementWithQuota_Quota()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getQuota();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ServiceAffectsElementWithQuota#getQuota <em>Quota</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quota</em>' attribute.
	 * @see #getQuota()
	 * @generated
	 */
	void setQuota(Long value);

	/**
	 * Returns the value of the '<em><b>Quota Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quota is the number of resource units currently allocated to the AffectedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quota Used</em>' attribute.
	 * @see #setQuotaUsed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ServiceAffectsElementWithQuota_QuotaUsed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getQuotaUsed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ServiceAffectsElementWithQuota#getQuotaUsed <em>Quota Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quota Used</em>' attribute.
	 * @see #getQuotaUsed()
	 * @generated
	 */
	void setQuotaUsed(Long value);

	/**
	 * Returns the value of the '<em><b>Quota Units</b></em>' attribute.
	 * The default value is <code>"byte"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * QuotaUnits specifies the type of unit used in the Quota and QuotaUsed properties. The value shall be formatted according to DSP0004 Appendix C1, where the base-unit is "byte"), and there are no occurrences of multiplied-base-unit and divided-base-unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quota Units</em>' attribute.
	 * @see #setQuotaUnits(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ServiceAffectsElementWithQuota_QuotaUnits()
	 * @model default="byte"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string' IsPUnit='true'"
	 * @generated
	 */
	String getQuotaUnits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ServiceAffectsElementWithQuota#getQuotaUnits <em>Quota Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quota Units</em>' attribute.
	 * @see #getQuotaUnits()
	 * @generated
	 */
	void setQuotaUnits(String value);

} // CIM_ServiceAffectsElementWithQuota
