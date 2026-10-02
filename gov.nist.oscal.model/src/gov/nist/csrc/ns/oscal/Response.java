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
package gov.nist.csrc.ns.oscal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Risk Response</b>
 *   : Describes either recommended or an actual plan for addressing the risk.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Response#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Response#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Response#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Response#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Response#getOrigin <em>Origin</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Response#getRequiredAsset <em>Required Asset</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Response#getTask <em>Task</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Response#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Response#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Response#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResponse()
 * @model extendedMetaData="name='oscal-assessment-common-response-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Response extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Response Title</b>
	 *   : The title for this response activity.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResponse_Title()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupLineDatatype" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Response#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Response Description</b>
	 *   : A human-readable description of this response plan.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResponse_Description()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Response#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResponse_Prop()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prop' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='props'"
	 * @generated
	 */
	EList<Property> getProp();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResponse_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Origin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResponse_Origin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='origin' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='origins'"
	 * @generated
	 */
	EList<Origin> getOrigin();

	/**
	 * Returns the value of the '<em><b>Required Asset</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.RequiredAsset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Asset</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResponse_RequiredAsset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='required-asset' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='required-assets'"
	 * @generated
	 */
	EList<RequiredAsset> getRequiredAsset();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResponse_Task()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='task' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='tasks'"
	 * @generated
	 */
	EList<Task> getTask();

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Remarks</b>
	 *   : Additional commentary about the containing object.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResponse_Remarks()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Response#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>Lifecycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Remediation Intent</b>
	 *   : Identifies whether this is a recommendation, such as from an assessor or tool, or an actual plan accepted by the system owner.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lifecycle</em>' attribute.
	 * @see #setLifecycle(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResponse_Lifecycle()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='lifecycle'"
	 * @generated
	 */
	String getLifecycle();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Response#getLifecycle <em>Lifecycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle</em>' attribute.
	 * @see #getLifecycle()
	 * @generated
	 */
	void setLifecycle(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Remediation Universally Unique Identifier</b>
	 *   : A machine-oriented, globally unique identifier with cross-instance scope that can be used to reference this remediation elsewhere in this or other OSCAL instances. The locally defined UUID of the risk response can be used to reference the data item locally or globally (e.g., in an imported OSCAL instance). This UUID should be assigned per-subject, which means it should be consistently used to identify the same subject across revisions of the document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResponse_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Response#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // Response
