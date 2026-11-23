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
 * A representation of the model object '<em><b>CIM Classifier Element In Classifier Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This aggregation represents the relationship between a ClassifierService and the ClassifierElements that provide its fan-out function. ClassifierElements represent the traffic selectors for the Service. A ClassifierService typically aggregates multiple ClassifierElements. An individual Element, however, is aggregated only by a single ClassifierService.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ClassifierElementInClassifierService#getClassifierOrder <em>Classifier Order</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ClassifierElementInClassifierService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' override.GroupComponent='CIM_ClassifierService REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Min='1' override.GroupComponent.Max='1' override.GroupComponent.Description='The ClassifierService which aggregates ClassifierElements.' override.PartComponent='CIM_ClassifierElement REF' override.PartComponent.Description='The aggregated ClassifierElement, defined in the context of one ClassifierService.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ClassifierElementInClassifierService extends CIM_ServiceComponent {
	/**
	 * Returns the value of the '<em><b>Classifier Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Because the filters for a classifier can overlap, it is necessary to specify the order in which the ClassifierElements are aggregated by a ClassifierService. This then dictates the order in which packets coming into the classifier are presented. Values are represented in ascending order: first '1', then '2', and so on. Different values MUST be assigned for each of the ClassifierElements aggregated by a given ClassifierService.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier Order</em>' attribute.
	 * @see #setClassifierOrder(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ClassifierElementInClassifierService_ClassifierOrder()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getClassifierOrder();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ClassifierElementInClassifierService#getClassifierOrder <em>Classifier Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Order</em>' attribute.
	 * @see #getClassifierOrder()
	 * @generated
	 */
	void setClassifierOrder(Long value);

} // CIM_ClassifierElementInClassifierService
