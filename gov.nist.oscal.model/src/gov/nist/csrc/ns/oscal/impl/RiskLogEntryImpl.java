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
import gov.nist.csrc.ns.oscal.LoggedBy;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.RelatedResponse;
import gov.nist.csrc.ns.oscal.RiskLogEntry;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

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
 * An implementation of the model object '<em><b>Risk Log Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskLogEntryImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskLogEntryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskLogEntryImpl#getStart <em>Start</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskLogEntryImpl#getEnd <em>End</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskLogEntryImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskLogEntryImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskLogEntryImpl#getLoggedBy <em>Logged By</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskLogEntryImpl#getStatusChange <em>Status Change</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskLogEntryImpl#getRelatedResponse <em>Related Response</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskLogEntryImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RiskLogEntryImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskLogEntryImpl extends MinimalEObjectImpl.Container implements RiskLogEntry {
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
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar end = END_EDEFAULT;

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
	 * The cached value of the '{@link #getLoggedBy() <em>Logged By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<LoggedBy> loggedBy;

	/**
	 * The default value of the '{@link #getStatusChange() <em>Status Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusChange()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusChange() <em>Status Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusChange()
	 * @generated
	 * @ordered
	 */
	protected String statusChange = STATUS_CHANGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedResponse() <em>Related Response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedResponse> relatedResponse;

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
	protected RiskLogEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getRiskLogEntry();
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RISK_LOG_ENTRY__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RISK_LOG_ENTRY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(XMLGregorianCalendar newStart) {
		XMLGregorianCalendar oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RISK_LOG_ENTRY__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(XMLGregorianCalendar newEnd) {
		XMLGregorianCalendar oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RISK_LOG_ENTRY__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.RISK_LOG_ENTRY__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.RISK_LOG_ENTRY__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoggedBy> getLoggedBy() {
		if (loggedBy == null) {
			loggedBy = new EObjectContainmentEList<LoggedBy>(LoggedBy.class, this, OSCALPackage.RISK_LOG_ENTRY__LOGGED_BY);
		}
		return loggedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusChange() {
		return statusChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusChange(String newStatusChange) {
		String oldStatusChange = statusChange;
		statusChange = newStatusChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RISK_LOG_ENTRY__STATUS_CHANGE, oldStatusChange, statusChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedResponse> getRelatedResponse() {
		if (relatedResponse == null) {
			relatedResponse = new EObjectContainmentEList<RelatedResponse>(RelatedResponse.class, this, OSCALPackage.RISK_LOG_ENTRY__RELATED_RESPONSE);
		}
		return relatedResponse;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RISK_LOG_ENTRY__REMARKS, oldRemarks, remarks));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RISK_LOG_ENTRY__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.RISK_LOG_ENTRY__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RISK_LOG_ENTRY__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RISK_LOG_ENTRY__LOGGED_BY:
				return ((InternalEList<?>)getLoggedBy()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RISK_LOG_ENTRY__RELATED_RESPONSE:
				return ((InternalEList<?>)getRelatedResponse()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.RISK_LOG_ENTRY__TITLE:
				return getTitle();
			case OSCALPackage.RISK_LOG_ENTRY__DESCRIPTION:
				return getDescription();
			case OSCALPackage.RISK_LOG_ENTRY__START:
				return getStart();
			case OSCALPackage.RISK_LOG_ENTRY__END:
				return getEnd();
			case OSCALPackage.RISK_LOG_ENTRY__PROP:
				return getProp();
			case OSCALPackage.RISK_LOG_ENTRY__LINK:
				return getLink();
			case OSCALPackage.RISK_LOG_ENTRY__LOGGED_BY:
				return getLoggedBy();
			case OSCALPackage.RISK_LOG_ENTRY__STATUS_CHANGE:
				return getStatusChange();
			case OSCALPackage.RISK_LOG_ENTRY__RELATED_RESPONSE:
				return getRelatedResponse();
			case OSCALPackage.RISK_LOG_ENTRY__REMARKS:
				return getRemarks();
			case OSCALPackage.RISK_LOG_ENTRY__UUID:
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
			case OSCALPackage.RISK_LOG_ENTRY__TITLE:
				setTitle((String)newValue);
				return;
			case OSCALPackage.RISK_LOG_ENTRY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OSCALPackage.RISK_LOG_ENTRY__START:
				setStart((XMLGregorianCalendar)newValue);
				return;
			case OSCALPackage.RISK_LOG_ENTRY__END:
				setEnd((XMLGregorianCalendar)newValue);
				return;
			case OSCALPackage.RISK_LOG_ENTRY__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.RISK_LOG_ENTRY__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.RISK_LOG_ENTRY__LOGGED_BY:
				getLoggedBy().clear();
				getLoggedBy().addAll((Collection<? extends LoggedBy>)newValue);
				return;
			case OSCALPackage.RISK_LOG_ENTRY__STATUS_CHANGE:
				setStatusChange((String)newValue);
				return;
			case OSCALPackage.RISK_LOG_ENTRY__RELATED_RESPONSE:
				getRelatedResponse().clear();
				getRelatedResponse().addAll((Collection<? extends RelatedResponse>)newValue);
				return;
			case OSCALPackage.RISK_LOG_ENTRY__REMARKS:
				setRemarks((String)newValue);
				return;
			case OSCALPackage.RISK_LOG_ENTRY__UUID:
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
			case OSCALPackage.RISK_LOG_ENTRY__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OSCALPackage.RISK_LOG_ENTRY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OSCALPackage.RISK_LOG_ENTRY__START:
				setStart(START_EDEFAULT);
				return;
			case OSCALPackage.RISK_LOG_ENTRY__END:
				setEnd(END_EDEFAULT);
				return;
			case OSCALPackage.RISK_LOG_ENTRY__PROP:
				getProp().clear();
				return;
			case OSCALPackage.RISK_LOG_ENTRY__LINK:
				getLink().clear();
				return;
			case OSCALPackage.RISK_LOG_ENTRY__LOGGED_BY:
				getLoggedBy().clear();
				return;
			case OSCALPackage.RISK_LOG_ENTRY__STATUS_CHANGE:
				setStatusChange(STATUS_CHANGE_EDEFAULT);
				return;
			case OSCALPackage.RISK_LOG_ENTRY__RELATED_RESPONSE:
				getRelatedResponse().clear();
				return;
			case OSCALPackage.RISK_LOG_ENTRY__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OSCALPackage.RISK_LOG_ENTRY__UUID:
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
			case OSCALPackage.RISK_LOG_ENTRY__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OSCALPackage.RISK_LOG_ENTRY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OSCALPackage.RISK_LOG_ENTRY__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case OSCALPackage.RISK_LOG_ENTRY__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case OSCALPackage.RISK_LOG_ENTRY__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.RISK_LOG_ENTRY__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.RISK_LOG_ENTRY__LOGGED_BY:
				return loggedBy != null && !loggedBy.isEmpty();
			case OSCALPackage.RISK_LOG_ENTRY__STATUS_CHANGE:
				return STATUS_CHANGE_EDEFAULT == null ? statusChange != null : !STATUS_CHANGE_EDEFAULT.equals(statusChange);
			case OSCALPackage.RISK_LOG_ENTRY__RELATED_RESPONSE:
				return relatedResponse != null && !relatedResponse.isEmpty();
			case OSCALPackage.RISK_LOG_ENTRY__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OSCALPackage.RISK_LOG_ENTRY__UUID:
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
		result.append(", start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(", statusChange: ");
		result.append(statusChange);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //RiskLogEntryImpl
