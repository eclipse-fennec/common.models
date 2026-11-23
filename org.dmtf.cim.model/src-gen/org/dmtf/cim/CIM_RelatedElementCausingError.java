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
 * A representation of the model object '<em><b>CIM Related Element Causing Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association defines the relationship between a failing managed element and the managed element that is causing the error. The cause and effect might be indirect. The cause might be simply that the lack of functionality of one component causes another component to be overworked. 
 * The association instance must exist as long as the cause-and- effect relationship exists.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RelatedElementCausingError#getFailureRelationshipInitiated <em>Failure Relationship Initiated</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RelatedElementCausingError#getEffectCorrelation <em>Effect Correlation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RelatedElementCausingError#getRanking <em>Ranking</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RelatedElementCausingError()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Core::CoreElements' override.Dependent='CIM_ManagedElement REF' override.Dependent.Key='true' override.Dependent.Description='Dependent represents the object whose degradation or failure is caused, in part, by the Antecedent.' override.Antecedent='CIM_ManagedElement REF' override.Antecedent.Key='true' override.Antecedent.Description='Antecedent represents the object causing the failure on the Dependent.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_RelatedElementCausingError extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Failure Relationship Initiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time that this failure relationship was created. The datetime should be provided because it is helpful to know when the effect was initiated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure Relationship Initiated</em>' attribute.
	 * @see #setFailureRelationshipInitiated(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RelatedElementCausingError_FailureRelationshipInitiated()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getFailureRelationshipInitiated();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RelatedElementCausingError#getFailureRelationshipInitiated <em>Failure Relationship Initiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Relationship Initiated</em>' attribute.
	 * @see #getFailureRelationshipInitiated()
	 * @generated
	 */
	void setFailureRelationshipInitiated(String value);

	/**
	 * Returns the value of the '<em><b>Effect Correlation</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration that very generally describes the correlation of the failure of the Antecedent to its effect on the Dependent. It describes the weight of the effect reported by an instance of this class. The effect of the Antecedent element can have a strong or heavy impact on the health of the Dependent element, or the impact can be weak or light.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effect Correlation</em>' attribute.
	 * @see #setEffectCorrelation(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RelatedElementCausingError_EffectCorrelation()
	 * @model default="10"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"2\",\"10\",\"..\"]' Values='[\"Strong Correlated\",\"Weakly Correlated\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Integer getEffectCorrelation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RelatedElementCausingError#getEffectCorrelation <em>Effect Correlation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect Correlation</em>' attribute.
	 * @see #getEffectCorrelation()
	 * @generated
	 */
	void setEffectCorrelation(Integer value);

	/**
	 * Returns the value of the '<em><b>Ranking</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Because more than one errant Managed Element could cause a Managed Element to fail, this ranking is used to express the most significant cause. 
	 * The Rank attribute is used to declare the ranking of a particular cause-and-effect relationship among all cause- and-effect relationships that are defined by instances of this association for a particular element. 
	 * 1 is the highest ranking. A rank of 1 declares that this cause-and-effect relationship is the most debilitating and should be addressed with priority over all other cause-and- effect relationships. As the rank increases, the effect imposed on the Antecedent Managed Element failure decreases. There should be only one instance of this association with a particular ranking value per Dependent instance. If there is more than one instance of the same ranking per Dependent instance, then the observer cannot determine from the model which cause-and-effect relationship to resolve first. 
	 * The ranking of existing instances can change over time based on the prevailing conditions of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ranking</em>' attribute.
	 * @see #setRanking(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RelatedElementCausingError_Ranking()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getRanking();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RelatedElementCausingError#getRanking <em>Ranking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ranking</em>' attribute.
	 * @see #getRanking()
	 * @generated
	 */
	void setRanking(Integer value);

} // CIM_RelatedElementCausingError
