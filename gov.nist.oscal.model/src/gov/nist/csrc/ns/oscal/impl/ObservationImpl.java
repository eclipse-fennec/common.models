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
package gov.nist.csrc.ns.oscal.impl;

import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Observation;
import gov.nist.csrc.ns.oscal.Origin;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.RelevantEvidence;
import gov.nist.csrc.ns.oscal.SubjectReference;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ObservationImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ObservationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ObservationImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ObservationImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ObservationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ObservationImpl#getType <em>Type</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ObservationImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ObservationImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ObservationImpl#getRelevantEvidence <em>Relevant Evidence</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ObservationImpl#getCollected <em>Collected</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ObservationImpl#getExpires <em>Expires</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ObservationImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ObservationImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationImpl extends MinimalEObjectImpl.Container implements Observation {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProp() <em>Prop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProp()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> prop;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<String> method;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<String> type;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected EList<Origin> origin;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<SubjectReference> subject;

	/**
	 * The cached value of the '{@link #getRelevantEvidence() <em>Relevant Evidence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevantEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<RelevantEvidence> relevantEvidence;

	/**
	 * The default value of the '{@link #getCollected() <em>Collected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollected()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar COLLECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollected() <em>Collected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollected()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar collected = COLLECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpires() <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpires()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EXPIRES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpires() <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpires()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar expires = EXPIRES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getObservation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.OBSERVATION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.OBSERVATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.OBSERVATION__PROP);
		}
		return prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.OBSERVATION__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMethod() {
		if (method == null) {
			method = new EDataTypeEList<String>(String.class, this, OSCALPackage.OBSERVATION__METHOD);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getType() {
		if (type == null) {
			type = new EDataTypeEList<String>(String.class, this, OSCALPackage.OBSERVATION__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Origin> getOrigin() {
		if (origin == null) {
			origin = new EObjectContainmentEList<Origin>(Origin.class, this, OSCALPackage.OBSERVATION__ORIGIN);
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubjectReference> getSubject() {
		if (subject == null) {
			subject = new EObjectContainmentEList<SubjectReference>(SubjectReference.class, this, OSCALPackage.OBSERVATION__SUBJECT);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelevantEvidence> getRelevantEvidence() {
		if (relevantEvidence == null) {
			relevantEvidence = new EObjectContainmentEList<RelevantEvidence>(RelevantEvidence.class, this, OSCALPackage.OBSERVATION__RELEVANT_EVIDENCE);
		}
		return relevantEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getCollected() {
		return collected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollected(XMLGregorianCalendar newCollected) {
		XMLGregorianCalendar oldCollected = collected;
		collected = newCollected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.OBSERVATION__COLLECTED, oldCollected, collected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getExpires() {
		return expires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpires(XMLGregorianCalendar newExpires) {
		XMLGregorianCalendar oldExpires = expires;
		expires = newExpires;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.OBSERVATION__EXPIRES, oldExpires, expires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.OBSERVATION__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.OBSERVATION__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.OBSERVATION__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.OBSERVATION__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.OBSERVATION__ORIGIN:
				return ((InternalEList<?>)getOrigin()).basicRemove(otherEnd, msgs);
			case OSCALPackage.OBSERVATION__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case OSCALPackage.OBSERVATION__RELEVANT_EVIDENCE:
				return ((InternalEList<?>)getRelevantEvidence()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OSCALPackage.OBSERVATION__TITLE:
				return getTitle();
			case OSCALPackage.OBSERVATION__DESCRIPTION:
				return getDescription();
			case OSCALPackage.OBSERVATION__PROP:
				return getProp();
			case OSCALPackage.OBSERVATION__LINK:
				return getLink();
			case OSCALPackage.OBSERVATION__METHOD:
				return getMethod();
			case OSCALPackage.OBSERVATION__TYPE:
				return getType();
			case OSCALPackage.OBSERVATION__ORIGIN:
				return getOrigin();
			case OSCALPackage.OBSERVATION__SUBJECT:
				return getSubject();
			case OSCALPackage.OBSERVATION__RELEVANT_EVIDENCE:
				return getRelevantEvidence();
			case OSCALPackage.OBSERVATION__COLLECTED:
				return getCollected();
			case OSCALPackage.OBSERVATION__EXPIRES:
				return getExpires();
			case OSCALPackage.OBSERVATION__REMARKS:
				return getRemarks();
			case OSCALPackage.OBSERVATION__UUID:
				return getUuid();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OSCALPackage.OBSERVATION__TITLE:
				setTitle((String)newValue);
				return;
			case OSCALPackage.OBSERVATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OSCALPackage.OBSERVATION__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.OBSERVATION__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.OBSERVATION__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends String>)newValue);
				return;
			case OSCALPackage.OBSERVATION__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends String>)newValue);
				return;
			case OSCALPackage.OBSERVATION__ORIGIN:
				getOrigin().clear();
				getOrigin().addAll((Collection<? extends Origin>)newValue);
				return;
			case OSCALPackage.OBSERVATION__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends SubjectReference>)newValue);
				return;
			case OSCALPackage.OBSERVATION__RELEVANT_EVIDENCE:
				getRelevantEvidence().clear();
				getRelevantEvidence().addAll((Collection<? extends RelevantEvidence>)newValue);
				return;
			case OSCALPackage.OBSERVATION__COLLECTED:
				setCollected((XMLGregorianCalendar)newValue);
				return;
			case OSCALPackage.OBSERVATION__EXPIRES:
				setExpires((XMLGregorianCalendar)newValue);
				return;
			case OSCALPackage.OBSERVATION__REMARKS:
				setRemarks((String)newValue);
				return;
			case OSCALPackage.OBSERVATION__UUID:
				setUuid((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OSCALPackage.OBSERVATION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OSCALPackage.OBSERVATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OSCALPackage.OBSERVATION__PROP:
				getProp().clear();
				return;
			case OSCALPackage.OBSERVATION__LINK:
				getLink().clear();
				return;
			case OSCALPackage.OBSERVATION__METHOD:
				getMethod().clear();
				return;
			case OSCALPackage.OBSERVATION__TYPE:
				getType().clear();
				return;
			case OSCALPackage.OBSERVATION__ORIGIN:
				getOrigin().clear();
				return;
			case OSCALPackage.OBSERVATION__SUBJECT:
				getSubject().clear();
				return;
			case OSCALPackage.OBSERVATION__RELEVANT_EVIDENCE:
				getRelevantEvidence().clear();
				return;
			case OSCALPackage.OBSERVATION__COLLECTED:
				setCollected(COLLECTED_EDEFAULT);
				return;
			case OSCALPackage.OBSERVATION__EXPIRES:
				setExpires(EXPIRES_EDEFAULT);
				return;
			case OSCALPackage.OBSERVATION__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OSCALPackage.OBSERVATION__UUID:
				setUuid(UUID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OSCALPackage.OBSERVATION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OSCALPackage.OBSERVATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OSCALPackage.OBSERVATION__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.OBSERVATION__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.OBSERVATION__METHOD:
				return method != null && !method.isEmpty();
			case OSCALPackage.OBSERVATION__TYPE:
				return type != null && !type.isEmpty();
			case OSCALPackage.OBSERVATION__ORIGIN:
				return origin != null && !origin.isEmpty();
			case OSCALPackage.OBSERVATION__SUBJECT:
				return subject != null && !subject.isEmpty();
			case OSCALPackage.OBSERVATION__RELEVANT_EVIDENCE:
				return relevantEvidence != null && !relevantEvidence.isEmpty();
			case OSCALPackage.OBSERVATION__COLLECTED:
				return COLLECTED_EDEFAULT == null ? collected != null : !COLLECTED_EDEFAULT.equals(collected);
			case OSCALPackage.OBSERVATION__EXPIRES:
				return EXPIRES_EDEFAULT == null ? expires != null : !EXPIRES_EDEFAULT.equals(expires);
			case OSCALPackage.OBSERVATION__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OSCALPackage.OBSERVATION__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", method: ");
		result.append(method);
		result.append(", type: ");
		result.append(type);
		result.append(", collected: ");
		result.append(collected);
		result.append(", expires: ");
		result.append(expires);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //ObservationImpl
