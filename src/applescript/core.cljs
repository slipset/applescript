(ns applescript.core)

(def mail (js/Application "Mail"))
(def content "This is my message to you!")

(def msg (.OutgoingMessage mail #js{:subject "Thanks"
                                    :content content
                                    :visible true}))

(.push (aget mail "outgoingMessages") msg)
(.activate mail)
