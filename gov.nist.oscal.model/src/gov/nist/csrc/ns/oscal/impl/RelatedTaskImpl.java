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

import gov.nist.csrc.ns.oscal.AssessmentSubject;
import gov.nist.csrc.ns.oscal.IdentifiedSubject;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.MarkupMultilineDatatype;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.RelatedTask;
import gov.nist.csrc.ns.oscal.ResponsibleParty;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RelatedTaskImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RelatedTaskImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RelatedTaskImpl#getResponsibleParty <em>Responsible Party</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RelatedTaskImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RelatedTaskImpl#getIdentifiedSubject <em>Identified Subject</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RelatedTaskImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RelatedTaskImpl#getTaskUuid <em>Task Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelatedTaskImpl extends MinimalEObjectImpl.Container implements RelatedTask {
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
	 * The cached value of the '{@link #getResponsibleParty() <em>Responsible Party</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleParty()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponsibleParty> responsibleParty;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<AssessmentSubject> subject;

	/**
	 * The cached value of the '{@link #getIdentifiedSubject() <em>Identified Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiedSubject()
	 * @generated
	 * @ordered
	 */
	protected IdentifiedSubject identifiedSubject;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected MarkupMultilineDatatype remarks;

	/**
	 * The default value of the '{@link #getTaskUuid() <em>Task Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskUuid() <em>Task Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskUuid()
	 * @generated
	 * @ordered
	 */
	protected String taskUuid = TASK_UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getRelatedTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.RELATED_TASK__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.RELATED_TASK__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResponsibleParty> getResponsibleParty() {
		if (responsibleParty == null) {
			responsibleParty = new EObjectContainmentEList<ResponsibleParty>(ResponsibleParty.class, this, OSCALPackage.RELATED_TASK__RESPONSIBLE_PARTY);
		}
		return responsibleParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssessmentSubject> getSubject() {
		if (subject == null) {
			subject = new EObjectContainmentEList<AssessmentSubject>(AssessmentSubject.class, this, OSCALPackage.RELATED_TASK__SUBJECT);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifiedSubject getIdentifiedSubject() {
		return identifiedSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifiedSubject(IdentifiedSubject newIdentifiedSubject, NotificationChain msgs) {
		IdentifiedSubject oldIdentifiedSubject = identifiedSubject;
		identifiedSubject = newIdentifiedSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.RELATED_TASK__IDENTIFIED_SUBJECT, oldIdentifiedSubject, newIdentifiedSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifiedSubject(IdentifiedSubject newIdentifiedSubject) {
		if (newIdentifiedSubject != identifiedSubject) {
			NotificationChain msgs = null;
			if (identifiedSubject != null)
				msgs = ((InternalEObject)identifiedSubject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.RELATED_TASK__IDENTIFIED_SUBJECT, null, msgs);
			if (newIdentifiedSubject != null)
				msgs = ((InternalEObject)newIdentifiedSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.RELATED_TASK__IDENTIFIED_SUBJECT, null, msgs);
			msgs = basicSetIdentifiedSubject(newIdentifiedSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RELATED_TASK__IDENTIFIED_SUBJECT, newIdentifiedSubject, newIdentifiedSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupMultilineDatatype getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemarks(MarkupMultilineDatatype newRemarks, NotificationChain msgs) {
		MarkupMultilineDatatype oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.RELATED_TASK__REMARKS, oldRemarks, newRemarks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(MarkupMultilineDatatype newRemarks) {
		if (newRemarks != remarks) {
			NotificationChain msgs = null;
			if (remarks != null)
				msgs = ((InternalEObject)remarks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.RELATED_TASK__REMARKS, null, msgs);
			if (newRemarks != null)
				msgs = ((InternalEObject)newRemarks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.RELATED_TASK__REMARKS, null, msgs);
			msgs = basicSetRemarks(newRemarks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RELATED_TASK__REMARKS, newRemarks, newRemarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaskUuid() {
		return taskUuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskUuid(String newTaskUuid) {
		String oldTaskUuid = taskUuid;
		taskUuid = newTaskUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RELATED_TASK__TASK_UUID, oldTaskUuid, taskUuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.RELATED_TASK__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RELATED_TASK__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RELATED_TASK__RESPONSIBLE_PARTY:
				return ((InternalEList<?>)getResponsibleParty()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RELATED_TASK__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RELATED_TASK__IDENTIFIED_SUBJECT:
				return basicSetIdentifiedSubject(null, msgs);
			case OSCALPackage.RELATED_TASK__REMARKS:
				return basicSetRemarks(null, msgs);
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
			case OSCALPackage.RELATED_TASK__PROP:
				return getProp();
			case OSCALPackage.RELATED_TASK__LINK:
				return getLink();
			case OSCALPackage.RELATED_TASK__RESPONSIBLE_PARTY:
				return getResponsibleParty();
			case OSCALPackage.RELATED_TASK__SUBJECT:
				return getSubject();
			case OSCALPackage.RELATED_TASK__IDENTIFIED_SUBJECT:
				return getIdentifiedSubject();
			case OSCALPackage.RELATED_TASK__REMARKS:
				return getRemarks();
			case OSCALPackage.RELATED_TASK__TASK_UUID:
				return getTaskUuid();
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
			case OSCALPackage.RELATED_TASK__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.RELATED_TASK__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.RELATED_TASK__RESPONSIBLE_PARTY:
				getResponsibleParty().clear();
				getResponsibleParty().addAll((Collection<? extends ResponsibleParty>)newValue);
				return;
			case OSCALPackage.RELATED_TASK__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends AssessmentSubject>)newValue);
				return;
			case OSCALPackage.RELATED_TASK__IDENTIFIED_SUBJECT:
				setIdentifiedSubject((IdentifiedSubject)newValue);
				return;
			case OSCALPackage.RELATED_TASK__REMARKS:
				setRemarks((MarkupMultilineDatatype)newValue);
				return;
			case OSCALPackage.RELATED_TASK__TASK_UUID:
				setTaskUuid((String)newValue);
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
			case OSCALPackage.RELATED_TASK__PROP:
				getProp().clear();
				return;
			case OSCALPackage.RELATED_TASK__LINK:
				getLink().clear();
				return;
			case OSCALPackage.RELATED_TASK__RESPONSIBLE_PARTY:
				getResponsibleParty().clear();
				return;
			case OSCALPackage.RELATED_TASK__SUBJECT:
				getSubject().clear();
				return;
			case OSCALPackage.RELATED_TASK__IDENTIFIED_SUBJECT:
				setIdentifiedSubject((IdentifiedSubject)null);
				return;
			case OSCALPackage.RELATED_TASK__REMARKS:
				setRemarks((MarkupMultilineDatatype)null);
				return;
			case OSCALPackage.RELATED_TASK__TASK_UUID:
				setTaskUuid(TASK_UUID_EDEFAULT);
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
			case OSCALPackage.RELATED_TASK__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.RELATED_TASK__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.RELATED_TASK__RESPONSIBLE_PARTY:
				return responsibleParty != null && !responsibleParty.isEmpty();
			case OSCALPackage.RELATED_TASK__SUBJECT:
				return subject != null && !subject.isEmpty();
			case OSCALPackage.RELATED_TASK__IDENTIFIED_SUBJECT:
				return identifiedSubject != null;
			case OSCALPackage.RELATED_TASK__REMARKS:
				return remarks != null;
			case OSCALPackage.RELATED_TASK__TASK_UUID:
				return TASK_UUID_EDEFAULT == null ? taskUuid != null : !TASK_UUID_EDEFAULT.equals(taskUuid);
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
		result.append(" (taskUuid: ");
		result.append(taskUuid);
		result.append(')');
		return result.toString();
	}

} //RelatedTaskImpl
